package com.task.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;

import com.task.serviceimp.UserServiceImp;

public class LoginServlet extends HttpServlet
{
	private Logger logger = Logger.getLogger(LoginServlet.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1623123428778050714L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String userName=String.valueOf(req.getParameter("userName"));
		String password=String.valueOf(req.getParameter("password"));
		if(userName.equals("null")||password.equals("null"))
		{
			resp.sendRedirect("login.html");
			logger.info(userName);
			logger.info(password);
			resp.sendRedirect("error.html");
		}
		String userjson;
		userjson="{\"userName\":\""+userName+"\",\"password\":\""+password+"\"}";
		logger.info(userjson);
		if(new UserServiceImp().ValidateUser(userjson))
		{
			HttpSession httpSession=(HttpSession)req.getSession();
			String httpSessionId = req.getRequestedSessionId();
			httpSession.setAttribute("userjson",userjson);
			httpSession.setAttribute("httpSessionId", httpSessionId);
			resp.sendRedirect("index.html");
		}
		else
			resp.sendRedirect("index.html");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req,resp);
	}
	
	
}

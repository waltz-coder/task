package com.task.serviceimp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.task.dao.UserDao;
import com.task.entity.User;
import com.task.service.UserService;
import com.task.utils.SqlSessionFactoryUtil;

import net.sf.json.JSONObject;

public class UserServiceImp implements UserService
{
	private Logger logger=Logger.getLogger(UserServiceImp.class);
	private JSONObject jsonObject=null;
	@Override
	public boolean ValidateUser(String userjson)
	{
		SqlSession sqlSession=SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		UserDao ud=sqlSession.getMapper(UserDao.class);
		User user=null;
		try
		{
			jsonObject=JSONObject.fromObject(userjson);
			user=(User)JSONObject.toBean(jsonObject, User.class);
			logger.info(user);
			List<User>list=ud.selectUserAll(user);
			sqlSession.commit();
			if(null!=list)
			{
				if(1==list.size())
				{
					return true;
				}
			}
		}
		catch(Exception e)
		{
			logger.info(e.getMessage(),e);
			sqlSession.rollback();
		}
		finally
		{
			sqlSession.close();
		}
		return false;
	}
	
}

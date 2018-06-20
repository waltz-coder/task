package com.task.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import com.task.entity.User;



/**
 * static 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-dao.xml");
		userDao=ctx.getBean(UserDao.class);
	}
 * @author zengm
 *
 */
@Component
public class UserDaoTest
{
	Logger logger=Logger.getLogger(this.getClass());
	
	@Autowired
	UserDao userDao;
	
	public void testSelectUserById()
	{
		User user=userDao.selectUserById(1l);
		logger.info(user.getUserName());
	//	fail("Not yet implemented");
	}
	
	
	public void testSelectUserAll()
	{
		//fail("Not yet implemented");
	}
	public static void main(String []args)
	{
		new UserDaoTest().testSelectUserById();
	}
}

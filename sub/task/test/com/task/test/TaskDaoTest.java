/**
 * 
 */
package com.task.test;
import org.apache.ibatis.session.RowBounds;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.task.dao.MaleHealthFormDao;
/**
 * @author zengm
 *
 */
import com.task.dao.TaskDao;
import com.task.dao.UserDao;
import com.task.entity.EmployeeTask;
import com.task.entity.MaleHealthForm;
import com.task.entity.Task;
import com.task.entity.User;
import com.task.serviceimp.UserServiceImp;
import com.task.utils.SqlSessionFactoryUtil;
public class TaskDaoTest
{
	private static Logger logger=Logger.getLogger(TaskDaoTest.class);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
		SqlSession sqlSession1 =SqlSessionFactoryUtil.getSqlSession(); 
		UserDao e=sqlSession.getMapper(UserDao.class);
		UserDao e1=sqlSession1.getMapper(UserDao.class);
		User task=new User();
		logger.info(e.selectUserById(1l));
		logger.info("再获取一次task");
//		sqlSession.commit();
		sqlSession.flushStatements();//刷新statement
		//logger.info(e.selectUserById(1l));
		sqlSession.commit();//commit会刷新一级缓存
		logger.info(e1.selectUserById(1l));
		sqlSession1.commit();
		long begin=System.currentTimeMillis();
		logger.info(new UserServiceImp().ValidateUser("{\"userName\":\"emp1\",\"password\":\"emp1\"}"));
		long end=System.currentTimeMillis()-begin;
		System.out.println(end);
	}
}

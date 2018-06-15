package com.task.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.task.dao.EmployeeDao;
import com.task.entity.Employee;
import com.task.utils.SqlSessionFactoryUtil;

public class EmployeeTest
{
	static Logger logger=Logger.getLogger(EmployeeTest.class);
	public static void main(String []a)
	{
		SqlSession sqlSession=null;
		try
		{
			sqlSession=SqlSessionFactoryUtil.getSqlSession();
			EmployeeDao ed=sqlSession.getMapper(EmployeeDao.class);
			Employee emp=ed.selectEmployeeById(1l);
			logger.info(emp.getBirthday());
			sqlSession.commit();
		}catch(Exception e)
		{
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			if(null!=sqlSession)
			{
				sqlSession.close();
			}
		}
	}
}

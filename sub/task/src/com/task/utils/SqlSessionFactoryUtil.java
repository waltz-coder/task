package com.task.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
public class SqlSessionFactoryUtil
{
	private static final Class<SqlSessionFactoryUtil> LOCK= SqlSessionFactoryUtil.class;
	private static SqlSessionFactory sqlSessionFactory;
	private static SqlSession sqlSession;
	public static SqlSessionFactory getSqlSessionFactory()
	{
		synchronized (LOCK)
		{
			if (null == sqlSessionFactory)
			{
				String path = "com/task/utils/mybatis.cfg.xml";
				try
				{
					InputStream resource = Resources.getResourceAsStream(path);
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sqlSessionFactory;
	}
	public static SqlSession getSqlSession()
	
	{
		if(null==sqlSessionFactory)
		{
			getSqlSessionFactory();
			sqlSession=sqlSessionFactory.openSession();
		}
		return sqlSession;
		
	}
}

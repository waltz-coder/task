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
import com.task.dao.WorkCardDao;
import com.task.entity.EmployeeTask;
import com.task.entity.MaleHealthForm;
import com.task.entity.Task;
import com.task.entity.WorkCard;
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
		WorkCardDao e=sqlSession.getMapper(WorkCardDao.class);
		WorkCardDao e1=sqlSession1.getMapper(WorkCardDao.class);
		WorkCard task=new WorkCard();
		logger.info(e.selectWorkCardById(1l));
		logger.info("再获取一次task");
//		sqlSession.commit();
		sqlSession.flushStatements();//刷新statement
		//logger.info(e.selectWorkCardById(1l));
		sqlSession.commit();//commit会刷新一级缓存
		logger.info(e1.selectWorkCardById(1l));
		sqlSession1.commit();
	}
	
}

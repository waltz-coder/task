package com.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.task.entity.WorkCard;

public interface WorkCardDao
{
/** select **/
	
	WorkCard selectWorkCardById(@Param("id")Long id);
	WorkCard selectWorkCardByEmpId(@Param("empid")Long empid);
	List<WorkCard> selectWorkCardAll();
	List<WorkCard> selectWorkCardByColumnLike(@Param("workCard")WorkCard workCard);
	List<WorkCard> selectWorkCardAll(RowBounds rowBounds);
	List<WorkCard> selectWorkCardByColumnLike(@Param("workCard")WorkCard workCard,RowBounds rowBounds);
	
	/** insert **/
	
	int insertWorkCard(@Param("workCard")WorkCard workCard);
	
	/** delete **/
	
	int deleteWorkCardById(@Param("id")Long id);
	int deleteWorkCard(@Param("workCard")WorkCard workCard);
	
	/** update **/
	
	int updateWorkCard(@Param("workCard")WorkCard workCard);
}

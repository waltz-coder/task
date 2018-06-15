package com.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.task.entity.Task;

public interface TaskDao
{
	/** select **/
	
	Task selectTaskById(@Param("id")Long id);
	List<Task> selectTaskAll();
	List<Task> selectTaskByColumnLike(@Param("task")Task task);
	List<Task> selectTaskAll(RowBounds rowBounds);
	List<Task> selectTaskByColumnLike(@Param("task")Task task,RowBounds rowBounds);
	
	/** insert **/
	
	int insertTask(@Param("task")Task task);
	
	/** delete **/
	
	int deleteTaskById(@Param("id")Long id);
	int deleteTask(@Param("task")Task task);
	
	/** update **/
	
	int updateTask(@Param("task")Task task);
}

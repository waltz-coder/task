package com.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.task.entity.EmployeeTask;

public interface EmployeeTaskDao
{
	EmployeeTask selectEmployeeTaskById(@Param("id")Long id);
	List<EmployeeTask> selectEmployeeTaskByEmpId(@Param("empid")Long empid);
}

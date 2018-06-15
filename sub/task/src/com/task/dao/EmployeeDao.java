package com.task.dao;

import org.apache.ibatis.annotations.Param;

import com.task.entity.Employee;

public interface EmployeeDao
{
	Employee selectEmployeeById(@Param("id")Long id);
}

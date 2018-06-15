package com.task.dao;


import org.apache.ibatis.annotations.Param;

import com.task.entity.MaleHealthForm;

public interface MaleHealthFormDao
{
	MaleHealthForm selectMaleHealthFormById(@Param("id")Long id);
	MaleHealthForm selectMaleHealthFormByEmpId(@Param("empid")Long empid);
}

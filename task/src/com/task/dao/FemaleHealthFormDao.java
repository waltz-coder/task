package com.task.dao;


import org.apache.ibatis.annotations.Param;

import com.task.entity.FemaleHealthForm;

public interface FemaleHealthFormDao
{
	FemaleHealthForm selectFemaleHealthFormById(@Param("id")Long id);
	FemaleHealthForm selectFemaleHealthFormByEmpId(@Param("empid")Long empid);
}

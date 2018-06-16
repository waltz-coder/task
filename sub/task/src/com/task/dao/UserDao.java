package com.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.task.entity.User;

public interface UserDao
{
	User selectUserById(@Param("id")Long id);
	List<User> selectUserAll(@Param("user")User user);
}

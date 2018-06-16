package com.task.entity;

public class User
{
	private Long id;
	private Long empId;
	private String userName;
	private String password;
	private Character deleteFlag;
	/**
	 * @return the id
	 */
	public final Long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public final String getUserName()
	{
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public final void setUserName(String userName)
	{
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public final String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public final void setPassword(String password)
	{
		this.password = password;
	}
	/**
	 * @return the empId
	 */
	public final Long getEmpId()
	{
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public final void setEmpId(Long empId)
	{
		this.empId = empId;
	}
	/**
	 * @return the deleteFlag
	 */
	public Character getDeleteFlag()
	{
		return deleteFlag;
	}
	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public void setDeleteFlag(Character deleteFlag)
	{
		this.deleteFlag = deleteFlag;
	}
	
	
}

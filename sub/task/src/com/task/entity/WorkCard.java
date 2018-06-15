package com.task.entity;

import java.io.Serializable;

public class WorkCard implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8605818448682715683L;
	private Long id;
	private Long empId;
	private String realName;
	private String department;
	private String mobile;
	private String position;
	private String note;
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
	 * @return the realName
	 */
	public final String getRealName()
	{
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public final void setRealName(String realName)
	{
		this.realName = realName;
	}
	/**
	 * @return the department
	 */
	public final String getDepartment()
	{
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public final void setDepartment(String department)
	{
		this.department = department;
	}
	/**
	 * @return the mobile
	 */
	public final String getMobile()
	{
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public final void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	/**
	 * @return the position
	 */
	public final String getPosition()
	{
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public final void setPosition(String position)
	{
		this.position = position;
	}
	/**
	 * @return the note
	 */
	public final String getNote()
	{
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public final void setNote(String note)
	{
		this.note = note;
	}
	/**
	 * @return the deleteFlag
	 */
	public final Character getDeleteFlag()
	{
		return deleteFlag;
	}
	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public final void setDeleteFlag(Character deleteFlag)
	{
		this.deleteFlag = deleteFlag;
	}
	
	
}

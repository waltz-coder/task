package com.task.entity;

import java.sql.Timestamp;
import java.util.List;

import com.task.enumeration.SexEnum;

public class Employee
{
	private Long id;
	private String realName;
	private SexEnum sex=null;
	private Timestamp birthday;
	private String mobile;
	private String email;
	private String position;
	private String note;
	private Character deleteFlag;
	//工牌按一对一级联
	private WorkCard workCard;
	//雇员任务 按一对多级联
	private List<EmployeeTask>employeeTaskList=null;
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
	 * @return the sex
	 */
	public final SexEnum getSex()
	{
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public final void setSex(SexEnum sex)
	{
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public final Timestamp getBirthday()
	{
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public final void setBirthday(Timestamp birthday)
	{
		this.birthday = birthday;
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
	 * @return the email
	 */
	public final String getEmail()
	{
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email)
	{
		this.email = email;
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
	/**
	 * @return the workCard
	 */
	public final WorkCard getWorkCard()
	{
		return workCard;
	}
	/**
	 * @param workCard the workCard to set
	 */
	public final void setWorkCard(WorkCard workCard)
	{
		this.workCard = workCard;
	}
	/**
	 * @return the employeeTaskList
	 */
	public final List<EmployeeTask> getEmployeeTaskList()
	{
		return employeeTaskList;
	}
	/**
	 * @param employeeTaskList the employeeTaskList to set
	 */
	public final void setEmployeeTaskList(List<EmployeeTask> employeeTaskList)
	{
		this.employeeTaskList = employeeTaskList;
	}
	
	
}

package com.task.entity;

public class EmployeeTask
{
	private Long id;
	private Long empId;
	private Task task=null;
	private String taskName;
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
	 * @return the task
	 */
	public final Task getTask()
	{
		return task;
	}
	/**
	 * @param task the task to set
	 */
	public final void setTask(Task task)
	{
		this.task = task;
	}
	/**
	 * @return the taskName
	 */
	public final String getTaskName()
	{
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public final void setTaskName(String taskName)
	{
		this.taskName = taskName;
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

package com.task.entity;

public class Task
{
	private Long id;
	private String title;
	private String context;
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
	 * @return the title
	 */
	public final String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the context
	 */
	public final String getContext()
	{
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public final void setContext(String context)
	{
		this.context = context;
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

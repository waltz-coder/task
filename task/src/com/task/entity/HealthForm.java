package com.task.entity;


public abstract class HealthForm
{
	//private Logger logger=Logger.getLogger(HealthForm.class);
	private Long id;
	private Long empId;
	private String heart;
	private String liver;
	private String spleen;
	private String lung;
	private String kidnet;
	private String note;
	private Character deleteFlag;
	
	/**
	 * @return the id
	 */
	public final Long getId()
	{
		//logger.info("id=:"+id);
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Long id)
	{
		this.id = id;
		//logger.info("id=:"+id);
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
	 * @return the heart
	 */
	public final String getHeart()
	{
		return heart;
	}
	/**
	 * @param heart the heart to set
	 */
	public final void setHeart(String heart)
	{
		this.heart = heart;
	}
	/**
	 * @return the liver
	 */
	public final String getLiver()
	{
		return liver;
	}
	/**
	 * @param liver the liver to set
	 */
	public final void setLiver(String liver)
	{
		this.liver = liver;
	}
	/**
	 * @return the spleen
	 */
	public final String getSpleen()
	{
		return spleen;
	}
	/**
	 * @param spleen the spleen to set
	 */
	public final void setSpleen(String spleen)
	{
		this.spleen = spleen;
	}
	/**
	 * @return the lung
	 */
	public final String getLung()
	{
		return lung;
	}
	/**
	 * @param lung the lung to set
	 */
	public final void setLung(String lung)
	{
		this.lung = lung;
	}
	/**
	 * @return the kidnet
	 */
	public final String getKidnet()
	{
		return kidnet;
	}
	/**
	 * @param kidnet the kidnet to set
	 */
	public final void setKidnet(String kidnet)
	{
		this.kidnet = kidnet;
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

package com.task.entity;

public class MaleEmployee extends Employee
{
	private MaleHealthForm maleHealthForm=null;

	/**
	 * @return the maleHealthForm
	 */
	public MaleHealthForm getMaleHealthForm()
	{
		return maleHealthForm;
	}

	/**
	 * @param maleHealthForm the maleHealthForm to set
	 */
	public void setMaleHealthForm(MaleHealthForm maleHealthForm)
	{
		this.maleHealthForm = maleHealthForm;
	}
	
}

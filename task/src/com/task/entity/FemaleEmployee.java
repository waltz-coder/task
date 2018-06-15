package com.task.entity;

public class FemaleEmployee extends Employee
{
	private FemaleHealthForm femaleHealthForm=null;

	/**
	 * @return the femaleHealthForm
	 */
	public FemaleHealthForm getFemaleHealthForm()
	{
		return femaleHealthForm;
	}

	/**
	 * @param femaleHealthForm the femaleHealthForm to set
	 */
	public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm)
	{
		this.femaleHealthForm = femaleHealthForm;
	}

	
	
}

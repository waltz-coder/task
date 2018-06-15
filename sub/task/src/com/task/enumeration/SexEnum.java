package com.task.enumeration;

public enum SexEnum
{
	MALE(1,"ÄÐ"),
	FEMALE(0,"Å®");
	private String name;
	private int id;
	SexEnum(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	/**
	 * @return the name
	 */
	public final String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public final int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(int id)
	{
		this.id = id;
	}
	public static SexEnum getSexById(int id)
	{
		for(SexEnum sex:SexEnum.values())
		{
			if(sex.getId()==id)
			{
				return sex;
			}
		}
		return null;
	}
	
}

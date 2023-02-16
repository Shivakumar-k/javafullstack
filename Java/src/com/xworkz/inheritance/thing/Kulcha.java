package com.xworkz.inheritance.thing;

public class Kulcha extends Naan{
	private String type;
	public void setType(String type)
	{
		this.type=type;
		System.out.println("kulcha");
	}
	public String getType()
	{
		return type;
	}


}
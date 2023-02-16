package com.xworkz.inheritance.thing;


public class Naan extends ButterRoti {
	private String name;
	public void setName(String name)
	{
		this.name=name;
		System.out.println("Naan");
	}
	public String getName()
	{
		return name;
	}


}
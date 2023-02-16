package com.xworkz.inheritance.thing;


public class OnionMasalaRoti extends OnionRoti{
	private double thickness;
	public void setThickNess(double thickness)
	{
		this.thickness=thickness;
		System.out.println("OnionMasalaRoti");
	}
	

	public  double getThickNess()
	{
		return thickness;
	}



}
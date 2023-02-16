package com.xworkz.inheritance.thing;


public class OnionRoti extends RagiRoti{
	private double weight;
	public void setWeight(double weight)
	{
		this.weight=weight;
		System.out.println("OnionRoti");
	}
	
	public  double getWeight()
	{
		return weight;
	}


}
package com.xworkz.inheritance.thing.overRiding;

public class BlackSoil extends Soil{
	
	{	
	System.out.println("black soil class started");
	}
	@Override
	public String setMoisture(String moisture) {
		System.out.println("Moisture of the soil " + moisture);
		return "wet";
	}
}

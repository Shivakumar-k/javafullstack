package com.xworkz.inheritance.thing.overRiding;

public class Soil {
	private String moisture;
	{
		System.out.println("Soil class started");
	}

	public String setMoisture(String moisture) {
		System.out.println("Moisture of the soil " + moisture);
		return null;
	}

	public float height() {
		return 9.5f;
	}
}

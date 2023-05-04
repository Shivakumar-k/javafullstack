package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;

public class Watch {
	@Value("casio")
	private String brand;
	@Value("casio")
    private String model;
    private String caseMaterial;
    private String bandMaterial;
    private double caseDiameter;
    private double caseThickness;
    private double bandWidth;
    private double weight;
    private int waterResistance;
    private double batteryLife;
    
    
	public Watch(String brand, String model, String caseMaterial, String bandMaterial, double caseDiameter,
			double caseThickness, double bandWidth, double weight, int waterResistance, double batteryLife) {
		super();
		this.brand = brand;
		this.model = model;
		this.caseMaterial = caseMaterial;
		this.bandMaterial = bandMaterial;
		this.caseDiameter = caseDiameter;
		this.caseThickness = caseThickness;
		this.bandWidth = bandWidth;
		this.weight = weight;
		this.waterResistance = waterResistance;
		this.batteryLife = batteryLife;
	}


}

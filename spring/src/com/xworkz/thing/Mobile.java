package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Setter
public class Mobile {
	
	
	@Value("Google")
	private String brand;
	@Value("pixel")
    private String model;
	@Value("Android")
    private String operatingSystem;
	@Value("15.2")
    private double screenSize;
	@Value("128")
    private int storageCapacity;
	@Value("30000")
    private double price;
	@Value("6")
	private int RAM;
	@Value("black")
    private String color;
	@Value("12")
    private int cameraResolution;
	
	public Mobile() {
		
	}
    
    
    public Mobile(String brand, String model, String operatingSystem, double screenSize, int storageCapacity,
			double price, int rAM, String color, int cameraResolution) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.screenSize = screenSize;
		this.storageCapacity = storageCapacity;
		this.price = price;
		RAM = rAM;
		this.color = color;
		this.cameraResolution = cameraResolution;
	}
    
    
    public String modelName() {
    	System.out.println("Running model");
		return model;
    	
    }
    

}

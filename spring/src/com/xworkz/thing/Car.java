package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Car {
	@Value("tesla")
	 private String make;
	@Value("S")
	    private String model;
	@Value("2018")
	    private int year;
	@Value("550000.5d")
	    private double price;
	@Value("12")
	    private int mileage;
	@Value("white")
	    private String color;
	@Value("true")
	    private String transmissionType;
	@Value("liquid")
	    private String fuelType;
	@Value("4")
	    private int numberOfDoors;
	@Value("true")
	    private boolean isElectric;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	    
	    
		public Car(String make, String model, int year, double price, int mileage, String color,
				String transmissionType, String fuelType, int numberOfDoors, boolean isElectric) {
			super();
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price;
			this.mileage = mileage;
			this.color = color;
			this.transmissionType = transmissionType;
			this.fuelType = fuelType;
			this.numberOfDoors = numberOfDoors;
			this.isElectric = isElectric;
		}
		
		public String brand() {
			return "Tesla";
		}
	    
	    

}

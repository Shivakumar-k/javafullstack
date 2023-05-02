package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Television {
	@Value("Lg")
	 private String brand;
	@Value("Android")
	    private String model;
	@Value("15000.0d")
	    private double price;
	@Value("48")
	    private int screenSize;
	@Value("1048")
	    private String resolution;
	@Value("true")
	    private boolean isSmartTV;
	@Value("4")
	    private int numberOfHDMI;
	@Value("3")
	    private int numberOfUSB;
	@Value("true")
	    private boolean hasBluetooth;
	@Value("Black")
	    private String color;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}
	    
		public Television(String brand, String model, double price, int screenSize, String resolution,
				boolean isSmartTV, int numberOfHDMI, int numberOfUSB, boolean hasBluetooth, String color) {
			
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.screenSize = screenSize;
			this.resolution = resolution;
			this.isSmartTV = isSmartTV;
			this.numberOfHDMI = numberOfHDMI;
			this.numberOfUSB = numberOfUSB;
			this.hasBluetooth = hasBluetooth;
			this.color = color;
		}
		
		public double price() {
			System.out.println("Running price Method");
			return 15000.50d;
		}


}

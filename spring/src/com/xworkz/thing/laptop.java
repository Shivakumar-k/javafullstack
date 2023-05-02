package com.xworkz.thing;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class laptop {
	
	@Value("Dell")
	private String brand;
	@Value("Inspirion")
	private String model;
	@Value("60000.0d")
    private double price;
	@Value("500")
    private int storageCapacity;
	@Value("250")
    private int ramSize;
	@Value("16.0")
    private double screenSize;
	@Value("intel I5")
    private String processor;
	@Value("Nvidia")
    private String graphicsCard;
	@Value("silver")
    private String color;
    
    public laptop() {
		// TODO Auto-generated constructor stub
	}
    
	public laptop(String brand, String model, double price, int storageCapacity, int ramSize, double screenSize,
			String processor, String graphicsCard, String color) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.storageCapacity = storageCapacity;
		this.ramSize = ramSize;
		this.screenSize = screenSize;
		this.processor = processor;
		this.graphicsCard = graphicsCard;
		this.color = color;
		
	}
	public double price() {
		System.out.println("Running price Method");
		return 10000.50d;
	}
    

}

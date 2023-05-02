package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Shoe {
	@Value("Nike")
	private String brand;
	@Value("jordan")
    private String model;
	@Value("4000.5")
    private double price;
	@Value("blue")
    private String color;
	@Value("8")
    private int size;
	@Value("male")
    private String gender;
	@Value("sneakers")
    private String style;
	@Value("true")
    private boolean isWaterproof;
	@Value("true")
    private boolean isBreathable;
	@Value("Recyled")
	private String material;
	
	public Shoe() {
		// TODO Auto-generated constructor stub
	}
	public Shoe(String brand, String model, double price, String color, int size, String gender, String style,
			boolean isWaterproof, boolean isBreathable, String material) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gender = gender;
		this.style = style;
		this.isWaterproof = isWaterproof;
		this.isBreathable = isBreathable;
		this.material = material;
	}
	
	public double price() {
		System.out.println("Running price Method");
		return 2000.50d;
	}

}

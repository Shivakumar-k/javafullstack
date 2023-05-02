package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Rocket {

	private String name;
	private String fuelType;
	private String engineType;
	private int payloadCapacity;
	private double height;
	private double diameter;
	private double mass;
	private double maxVelocity;
	private double range;
	private double cost;
	
	public Rocket(@Value("PSLV2") String name,@Value("Liquid fueled") String fuelType,@Value("Liquid") String engineType, @Value("1000")int payloadCapacity,@Value("250.00d") double height, @Value("25.55d")double diameter,
			@Value("1500.2d")double mass, @Value("7000.00d")double maxVelocity,@Value("100000.25d") double range,@Value("425000.56d") double cost) {
		this.name = name;
		this.fuelType = fuelType;
		this.engineType = engineType;
		this.payloadCapacity = payloadCapacity;
		this.height = height;
		this.diameter = diameter;
		this.mass = mass;
		this.maxVelocity = maxVelocity;
		this.range = range;
		this.cost = cost;
	}
	
	public String rocketName() {
		System.out.println("Running rocket name method");
		return name;
	}

	
	
}

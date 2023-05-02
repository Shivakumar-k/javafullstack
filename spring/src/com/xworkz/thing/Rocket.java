package com.xworkz.thing;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Rocket {

	private String name;
	private String fuelType;
	private String engineType;
	private double thrust;
	private double burnTime;
	private int payloadCapacity;
	private double height;
	private double diameter;
	private double mass;
	private double propellantMass;
	private double specificImpulse;
	private double maxVelocity;
	private double range;
	private double cost;

//	public Rocket() {
//		System.out.println("No arg constructpr for rocket");
//	}
	@Bean
	public String rocketName() {
		System.out.println("Running rocket name method");
		return "PSLV4";
	}

	@Bean
	public String type() {
		System.out.println("Running type method");

		return "liquid fueled";
	}

	@Bean
	public double cost() {

		System.out.println("Running cost method");

		return 75000000;

	}

	@Bean
	public Integer payLoad() {
		System.out.println("Running payLoad method");
		return 1000;

	}

}

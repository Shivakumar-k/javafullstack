package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Hotel {
	@Value("nandhana")
	private String name;
	@Value("banglore")
    private String location;
	@Value("48")
    private int numberOfRooms;
	@Value("2500.0d")
    private double roomPrice;
	@Value("Rajainagar")
    private String address;
	@Value("true")
    private boolean hasGym;
	@Value("true")
    private boolean hasRestaurant;
	@Value("4")
    private int starRating;
	@Value("2016")
	
	
    private int yearBuilt;
	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	
	public Hotel(String name, String location, int numberOfRooms, double roomPrice, String address, boolean hasGym,
			boolean hasRestaurant, int starRating,  int yearBuilt) {
		
		this.name = name;
		this.location = location;
		this.numberOfRooms = numberOfRooms;
		this.roomPrice = roomPrice;
		this.address = address;
		this.hasGym = hasGym;
		this.hasRestaurant = hasRestaurant;
		this.starRating = starRating;
		
		this.yearBuilt = yearBuilt;
	}

    public String name() {
    	System.out.println("running name method");
    	return "Nandhana Palace";
    }
    
}

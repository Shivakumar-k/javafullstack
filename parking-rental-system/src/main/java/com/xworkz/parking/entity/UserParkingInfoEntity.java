package com.xworkz.parking.entity;

import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data
public class UserParkingInfoEntity {
	
	private int uId;
	private String location;

	private String vehicleType;

	private String vehicleFuelType;

	private String vehicleBrand;

	private String rentalTerms;

	private int price;

	private int discount;


}

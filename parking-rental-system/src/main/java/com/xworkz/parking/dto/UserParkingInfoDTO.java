package com.xworkz.parking.dto;

import lombok.Data;

@Data
public class UserParkingInfoDTO {
	 
	private int uId;
	private String location;

	private String vehicleType;

	private String vehicleFuelType;

	private String vehicleBrand;

	private String rentalTerms;

	private int price;

	private int discount;
	
	private int total;

}

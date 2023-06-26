package com.xworkz.parking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParkingInfoDTO {

	private String location;

	private String vehicleType;

	private String vehicleFuelType;

	private String vehicleBrand;

	private String rentalTerms;

	private int price;

	private int discount;

}

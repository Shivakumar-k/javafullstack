package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "user_parking_info")

public class UserParkingInfoEntity {
	@Column(name = "u_id")
	private int uId;
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "vehicleType")
	private String vehicleType;
	@Column(name = "vehicleFuelType")
	private String vehicleFuelType;
	@Column(name = "vehicleBrand")
	private String vehicleBrand;
	@Column(name = "rentalTerms")
	private String rentalTerms;
	@Column(name = "price")
	private int price;
	@Column(name = "discount")
	private int discount;
	@Column(name = "total")
	private int total;

}

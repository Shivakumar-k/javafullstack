package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "parking_info")
@NamedQuery(name = "findByAll", query = "select aa from ParkingInfoEntity aa where aa.location=:lc and aa.vehicleType=:type and aa.vehicleFuelType=:fuel and aa.vehicleBrand=:brand and aa.rentalTerms=:days")
@NamedQuery(name = "findByLocation", query = "select info from ParkingInfoEntity as info where info.location like :byLocation")
public class ParkingInfoEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_location")
	private String location;
	@Column(name = "p_vehicleType")
	private String vehicleType;
	@Column(name = "p_vehicleFuelType")
	private String vehicleFuelType;
	@Column(name = "p_vehicleBrand")
	private String vehicleBrand;
	@Column(name = "p_rentalTerms")
	private String rentalTerms;
	@Column(name = "p_price")
	private int price;
	@Column(name = "p_offers")
	private int discount;

}

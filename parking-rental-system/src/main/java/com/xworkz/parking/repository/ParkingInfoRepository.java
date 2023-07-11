package com.xworkz.parking.repository;

import java.util.Collections;
import java.util.List;


import com.xworkz.parking.entity.ParkingInfoEntity;

public interface ParkingInfoRepository {
	
	
	boolean save(ParkingInfoEntity entity);

	default List<ParkingInfoEntity> findByLocation(String location){
		return Collections.emptyList();
		
	}
	default ParkingInfoEntity findByVariables(String location,String vehicleType, String vehicleBrand,String vehicleFuelType, String rentalTerms) {
		return null;
	}
	
	
}

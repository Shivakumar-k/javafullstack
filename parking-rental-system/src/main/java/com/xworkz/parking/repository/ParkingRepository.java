package com.xworkz.parking.repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;

public interface ParkingRepository {

	default List<ParkingEntity> findAll() {
		return Collections.emptyList();
	}

	default List<ParkingInfoEntity> findByLocation(String location) {
		return Collections.emptyList();
	}
	
	List<ParkingEntity> findByEmail(String email);
	
	 boolean updateLoginTime(String email,LocalDateTime dateTime); 

}

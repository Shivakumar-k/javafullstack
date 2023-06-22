package com.xworkz.parking.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.parking.entity.ParkingEntity;

public interface ParkingRepository {
	
	default List<ParkingEntity> findAll(){
		return Collections.emptyList();
	}
	

}

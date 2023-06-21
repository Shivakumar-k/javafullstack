package com.xworkz.parking.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.parking.entity.ParkingEntity;

public interface ParkingRepository {
	
	default List<ParkingEntity> findByEmailAndPsssword(String email,String password){
		return Collections.emptyList();
	}
	

}

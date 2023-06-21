package com.xworkz.parking.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.parking.dto.ParkingDTO;


public interface ParkingService {
	
	default List<ParkingDTO> findByEmailAndPassword(String email,String password){
		return Collections.emptyList();
	}


}

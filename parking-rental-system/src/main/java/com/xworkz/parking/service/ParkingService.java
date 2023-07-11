package com.xworkz.parking.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.parking.dto.ParkingDTO;


public interface ParkingService {
	
	default List<ParkingDTO> findAll(){
		return Collections.emptyList();
	}
	default public ParkingDTO validate(ParkingDTO dto) {
		return null;
	}


}

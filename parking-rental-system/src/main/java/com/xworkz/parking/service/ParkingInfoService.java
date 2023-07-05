package com.xworkz.parking.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.parking.dto.ParkingInfoDTO;


public interface ParkingInfoService {
	
	boolean validateAndSave(ParkingInfoDTO infoDto);
	
	default List<ParkingInfoDTO> findByLocation(String location){
		return Collections.emptyList();
		
	}

}

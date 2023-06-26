package com.xworkz.parking.service;

import com.xworkz.parking.dto.ParkingInfoDTO;

public interface ParkingInfoService {
	
	boolean validateAndSave(ParkingInfoDTO infoDto);

}

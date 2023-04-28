package com.xworkz.ambulance.service;

import com.xworkz.ambulance.dto.AmbulanceDTO;

public interface AmbulanceService {
	boolean validateAndSave(AmbulanceDTO dto);

}

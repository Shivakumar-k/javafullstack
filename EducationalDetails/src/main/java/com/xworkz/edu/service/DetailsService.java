package com.xworkz.edu.service;

import com.xworkz.edu.dto.DetailsDTO;

public interface DetailsService {
	
	boolean validateAndSave(DetailsDTO dto) throws ClassNotFoundException;

}

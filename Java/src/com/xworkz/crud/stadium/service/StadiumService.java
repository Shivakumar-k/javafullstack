package com.xworkz.crud.stadium.service;

import com.xworkz.crud.stadium.StadiumDTO;

public interface StadiumService {
	
	boolean validateAndSave(StadiumDTO dto);
	
	StadiumDTO find(StadiumDTO dto);
	
	StadiumDTO findByName(String name);
	
	int findCapacityByName(String name);
	
	double findTicketByNameAndCapacity(String name, int capacity);

	int total();

}

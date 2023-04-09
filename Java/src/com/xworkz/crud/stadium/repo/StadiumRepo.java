package com.xworkz.crud.stadium.repo;
import com.xworkz.crud.stadium.StadiumDTO;

public interface StadiumRepo {
	
	boolean save(StadiumDTO dto);
	
    StadiumDTO find(StadiumDTO dto);
	
	StadiumDTO findByName(String name);
	
	int findCapacityByName(String name);
	
	double findTicketByNameAndCapacity(String name, int capacity);

	int total();

}

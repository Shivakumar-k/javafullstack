package com.xworkz.crud.god.repo;

import com.xworkz.crud.god.GodDTO;

public interface GodRepo {
	
	boolean save(GodDTO dto);
	
	GodDTO find(GodDTO dto);
	
	GodDTO findByName(String name);
	
	String findFestvalByNameAndReligion(String name, String religion);
	
	int findHolidaysByNameByReligionByFestival(String name,String religion, String festival );
	
	int total();
	
	
	
	
	
	
	
	

}

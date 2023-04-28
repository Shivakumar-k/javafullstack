package com.xworkz.crud.god.service;

import com.xworkz.crud.god.GodDTO;

public interface GodService {
	
    boolean validateAndSave(GodDTO dto);
	
	GodDTO find(GodDTO dto);
	
	GodDTO findByName(String name);
	
	String findFestvalByNameAndReligion(String name, String religion);
	
	int findHolidaysByNameByReligionByFestival(String name,String religion, String festival );
	
	int total();

}

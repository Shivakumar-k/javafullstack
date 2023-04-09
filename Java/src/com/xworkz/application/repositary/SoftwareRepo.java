package com.xworkz.application.repositary;

import com.xworkz.application.dto.SoftwareDTO;

public interface SoftwareRepo {
	
	boolean save(SoftwareDTO dto);
	
	boolean isExist(SoftwareDTO dto);
	
   int totalSave();
   
   default SoftwareDTO findBy(int id) {
	   return null;
   }
   default SoftwareDTO findByName(String name) {
	   return null;
   }
	default SoftwareDTO findByNameAndId(String name,int id) {
		return null;
	}

}

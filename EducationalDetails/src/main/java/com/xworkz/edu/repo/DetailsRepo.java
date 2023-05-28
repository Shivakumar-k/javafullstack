package com.xworkz.edu.repo;

import com.xworkz.edu.dto.DetailsDTO;

public interface DetailsRepo {
	
	boolean save(DetailsDTO dto) throws ClassNotFoundException; 
	

}

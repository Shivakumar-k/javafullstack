package com.xworkz.contact.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.contact.dto.ContactDTO;



public interface ContactService {
	
	boolean validateAndSave(ContactDTO dto);
	
	 default List<ContactDTO> findByName(String name){
		return Collections.emptyList();
	}

}

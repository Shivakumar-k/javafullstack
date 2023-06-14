package com.xworkz.contact.service;

import com.xworkz.contact.dto.ContactDTO;

public interface ContactService {
	
	boolean validateAndSave(ContactDTO dto);

}

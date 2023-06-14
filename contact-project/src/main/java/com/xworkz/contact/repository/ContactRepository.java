package com.xworkz.contact.repository;

import com.xworkz.contact.dto.ContactDTO;

public interface ContactRepository {
	
	boolean save(ContactDTO dto);

}

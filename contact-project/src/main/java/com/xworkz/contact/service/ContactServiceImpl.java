package com.xworkz.contact.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.entity.ContactEntity;
import com.xworkz.contact.repository.ContactRepository;
@Service
@Component
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repository;
	
	public ContactServiceImpl() {
		System.out.println("no arg const of ContactServiceImpl");
	}

	@Override
	public boolean validateAndSave(ContactDTO dto) {
		System.out.println("Running validate And save");
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(""+entity);
		return this.repository.save(entity);
	}
}

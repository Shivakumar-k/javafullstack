package com.xworkz.contact.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.contact.dto.ContactDTO;

@Component
@RequestMapping("/")
public class ContactController {
	
	private Collection<ContactDTO> contactDTOs = new ArrayList();
	
	public ContactController() {
	System.out.println("Running ContactController");
	}
	@RequestMapping("/send")
	public String send(ContactDTO dto,Model m) {
		System.out.println("Running send method");
		System.out.println("Entered values:" + dto);
		
		this.contactDTOs.add(dto);
		
		for (ContactDTO contactDTO : contactDTOs) {
			System.out.println("Saved Successfully "+contactDTO);
		}
		
		m.addAttribute("msg", "Registered successfully "+dto.getName());
		
		return "display.jsp";
	}
	
	

}

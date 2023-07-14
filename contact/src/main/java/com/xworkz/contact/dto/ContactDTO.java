package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class ContactDTO implements Serializable {
	
	private String name;
	private String email;
	private String country;
	private String mobile;
	private String type;
	private String description;
	
	
	

}

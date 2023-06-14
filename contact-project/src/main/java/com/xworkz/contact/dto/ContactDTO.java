package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;

	private String email;

	private long mobile;

	private String comments;

	private String originalFileName;

	private String fileName;
	private String contentType;
	private long fileSize;
	
	@Override
	public int compareTo(ContactDTO o) {
		
		return this.getName().compareTo(o.name);
	}
  
	
	
}

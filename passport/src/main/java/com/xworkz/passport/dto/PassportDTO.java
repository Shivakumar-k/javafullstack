package com.xworkz.passport.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class PassportDTO implements Serializable {
	
	private String fname;
	private String lname;
	private String email;
	private String mobile;

}

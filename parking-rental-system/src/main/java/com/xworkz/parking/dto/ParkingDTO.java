package com.xworkz.parking.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ParkingDTO implements Serializable {
	
	private String name;
	private String email;
	private String password;
	
	private LocalDateTime loginTime;
	

}

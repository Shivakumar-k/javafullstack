package com.xworkz.parking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSignUpDTO {

	private String name;
	private String email;
	private String password;
	private long mobile;
	private String address;

	private int otp;

}

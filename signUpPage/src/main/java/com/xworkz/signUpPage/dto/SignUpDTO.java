package com.xworkz.signUpPage.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignUpDTO implements Serializable, Comparable<SignUpDTO> {

	private String uname;
	private String password;
	private String email;
	private String mobileNo;
	private String otp;

	@Override
	public int compareTo(SignUpDTO o) {
		System.out.println("Running compareTo method in dto");
		return this.uname.compareTo(uname);
	}

}

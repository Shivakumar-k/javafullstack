package com.xworkz.parking.service;

import com.xworkz.parking.dto.UserSignUpDTO;

public interface UserSignUpService {
	
	boolean save(UserSignUpDTO dto);
	
	boolean verifyOtp(UserSignUpDTO dto);
	
}

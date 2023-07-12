package com.xworkz.parking.repository;

import com.xworkz.parking.entity.UserSignUpEntity;

public interface UserSignUpRepo {

	boolean save(UserSignUpEntity entity);

	UserSignUpEntity findByEmail(String email);
	
	boolean updateOtpByEmail(String email, String otp);

	UserSignUpEntity findByOTP(String otp);

}

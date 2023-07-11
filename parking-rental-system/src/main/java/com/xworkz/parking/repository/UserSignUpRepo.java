package com.xworkz.parking.repository;

import java.util.List;

import com.xworkz.parking.entity.UserSignUpEntity;

public interface UserSignUpRepo {
	
	boolean save(UserSignUpEntity entity);

	List<UserSignUpEntity> findByEmail(String email);

}

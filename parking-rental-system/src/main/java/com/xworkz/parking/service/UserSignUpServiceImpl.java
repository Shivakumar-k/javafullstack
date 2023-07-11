package com.xworkz.parking.service;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.xworkz.parking.dto.UserSignUpDTO;
import com.xworkz.parking.entity.UserSignUpEntity;
import com.xworkz.parking.repository.UserSignUpRepo;
import com.xworkz.parking.util.SendMail;

public class UserSignUpServiceImpl implements UserSignUpService {
	
	private UserSignUpRepo repo;

	@Override
	public boolean save(UserSignUpDTO dto) {
		System.out.println("running save method in UserSignUpService");
		UserSignUpEntity entity1 = new UserSignUpEntity();
		BeanUtils.copyProperties(dto, entity1);
		boolean save = this.repo.save(entity1);
		List<UserSignUpEntity> entity2 = repo.findByEmail(dto.getEmail());
		SendMail.sendMail(entity2.getEmail(), entity1);

		this.repo.updateOtpByEmail(entity2.getEmail(), SendMail.otp);
		return save;
	}

}

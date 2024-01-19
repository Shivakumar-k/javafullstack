package com.xworkz.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserSignUpDTO;
import com.xworkz.parking.entity.UserSignUpEntity;
import com.xworkz.parking.repository.UserSignUpRepo;
import com.xworkz.parking.util.SendMail;

@Service
public class UserSignUpServiceImpl implements UserSignUpService {
	@Autowired
	private UserSignUpRepo repo;

	@Override
	public boolean save(UserSignUpDTO dto) {
		System.out.println("running save method in UserSignUpService");
		UserSignUpEntity entity1 = new UserSignUpEntity();
		BeanUtils.copyProperties(dto, entity1);
		boolean save = this.repo.save(entity1);
		// UserSignUpEntity entity2 = repo.findByEmail(dto.getEmail());
		// SendMail.sendMail(entity2.getEmail(), entity1);

		// this.repo.updateOtpByEmail(entity2.getEmail(), SendMail.otp);
		return save;
	} 
	@Override
	public boolean verifyOtp(UserSignUpDTO dto) {
		System.out.println("Running verifyOtp method in UserSignUpServiceImpl");
		UserSignUpEntity entity1 = this.repo.findByOTP(dto.getOtp());
		UserSignUpEntity entity2 = this.repo.findByEmail(entity1.getEmail());
		if (dto.getOtp().equals(entity2.getOtp())) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean sendOtp(String email) {
		System.out.println("Running sendOtp method in service");
		UserSignUpEntity entity2 = new UserSignUpEntity();
		UserSignUpEntity entity = repo.findByEmail(email);
		SendMail.sendMail(entity.getEmail(), entity2);
		this.repo.updateOtpByEmail(entity.getEmail(), SendMail.otp);

		return true;
	}

}

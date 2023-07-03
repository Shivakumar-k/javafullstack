package com.xworkz.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;
import com.xworkz.parking.repository.UserInfoRepository;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoRepository repo;
	
	public UserInfoServiceImpl() {
		System.out.println("No-args UserInfoServiceImpl");
	}
	
	

	@Override
	public boolean validateAndSave(UserInfoDTO dto1, UserParkingInfoDTO dto2) {
		System.out.println("Running validateAndSave method");
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		BeanUtils.copyProperties(dto1, userInfoEntity);
		this.repo.save(userInfoEntity);
		
		UserParkingInfoEntity parkingInfoEntity = new UserParkingInfoEntity();
		BeanUtils.copyProperties(dto2, parkingInfoEntity);
		UserInfoEntity userEntity =repo.findByEmail(dto1.getEmail());
		parkingInfoEntity.setUId(userEntity.getId());
		System.out.println("Entity is:" + userInfoEntity);
		
		
		return this.repo.save(parkingInfoEntity);
	}

}

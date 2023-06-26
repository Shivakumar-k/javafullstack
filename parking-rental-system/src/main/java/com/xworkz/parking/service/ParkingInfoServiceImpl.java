package com.xworkz.parking.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.repository.ParkingInfoRepository;
@Service
public class ParkingInfoServiceImpl implements ParkingInfoService {
	@Autowired
	private ParkingInfoRepository repo;
	
	public ParkingInfoServiceImpl() {
		System.out.println("Running ParkingInfoServiceImpl with no-arg const...........");
	}

	@Override
	public boolean validateAndSave(ParkingInfoDTO infoDto) {
		System.out.println("Running validate and save method");
		ParkingInfoEntity infoEntity = new ParkingInfoEntity();
		BeanUtils.copyProperties(infoDto, infoEntity);
		System.out.println(" "+infoEntity);
		if(infoDto!=null) {
			System.out.println("infoDto is not null we can save "+infoDto);
		    boolean	save = this.repo.save(infoEntity);
		    if(save) {
		    	System.out.println("data saved in database");
		    }else {
		    	System.out.println("data not saved");
		    }
				
		}else {
			System.out.println("infoDto is null we cannot save ");
		}
		
		return true;
	}

}

package com.xworkz.parking.service;


import java.util.List;
import java.util.stream.Collectors;

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
	
	@Override
	public List<ParkingInfoDTO> findByLocation(String location) {
		System.out.println("Running findByLocation: "+location);
		List<ParkingInfoEntity> entities=this.repo.findByLocation(location);
		
		List<ParkingInfoDTO> dtos = entities.stream().map(ent -> {
			ParkingInfoDTO infoDTO = new ParkingInfoDTO();
			BeanUtils.copyProperties(ent, infoDTO);
			return infoDTO;
		}).collect(Collectors.toList());
		
		return dtos;
	}
	
	@Override
	public ParkingInfoDTO isExist(String location, String vehicleType, String vehicleBrand, String vehicleFuelType,
			String rentalTerms) {
		System.out.println("running isExist method in service");
		ParkingInfoEntity entity = this.repo.findByVariables(location, vehicleType, vehicleBrand, vehicleFuelType, rentalTerms);
		if(entity!= null) {
			ParkingInfoDTO dto = new ParkingInfoDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}else {
			return null;
		}
	}

}

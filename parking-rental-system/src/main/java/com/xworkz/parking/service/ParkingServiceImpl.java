package com.xworkz.parking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.repository.ParkingRepository;
@Service
public class ParkingServiceImpl implements ParkingService {
	@Autowired
	private ParkingRepository repo;
	
	
	public ParkingServiceImpl() {
		System.out.println("Running no arg const of serviceImpl");
	}
	
	@Override
	public List<ParkingDTO> findByEmailAndPassword(String email, String password) {
		System.out.println("Running findByEmailAndPsssword in service ");
		List<ParkingEntity> entities = this.repo.findByEmailAndPsssword(email, password);
		
		
		List<ParkingDTO> dtos = entities.stream().map(ent -> {
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;
			
		}).collect(Collectors.toList());

		return dtos;
		
	}

}

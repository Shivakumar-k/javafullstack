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
	public List<ParkingDTO> findAll() {
		System.err.println("Running findByEmailAndPsssword in service ");
		List<ParkingEntity> entities = this.repo.findAll();

		List<ParkingDTO> dtos = entities.stream().map(ent -> {
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;

		}).collect(Collectors.toList());

		return dtos;
	}

	@Override
	public boolean validate(ParkingDTO dto) {
		System.out.println("Running Validate in service");
		if (dto != null) {
			System.out.println("dto is not null" + dto);
            System.out.println(dto.getEmail());
//            ParkingEntity parkingEntity =  
			List<ParkingEntity> list = this.repo.findAll();
			for (ParkingEntity entity : list) {
				if (entity.getEmail().equals(dto.getEmail()) && entity.getPassword().equals(dto.getPassword())) {
					System.out.println("valid Email and password");
					return true;
				}
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}

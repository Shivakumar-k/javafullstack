package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SalesManagerDTO;
import com.xworkz.showRoom.repo.SalesManagerRepoImpl;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {
	
	private SalesManagerRepoImpl repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {
		
		System.out.println("Running validateAndSave");
		
		if(dto!=null) {
			System.out.println("dto is not null we can save");
			
			Set<ConstraintViolation<SalesManagerDTO>> ConstraintViolation = validator.validate(dto);

			System.out.println("Total number of violations: " + ConstraintViolation.size());
			ConstraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));

			if (ConstraintViolation != null && ConstraintViolation.isEmpty()) {
				System.out.println("no constraint violation in dto");
				return this.repo.save(dto);
			}
			
			
		}else {
			System.out.println("dto is null");
		}
		
		return false;
	}

}

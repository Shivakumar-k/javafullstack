package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.PolishDTO;
import com.xworkz.showRoom.repo.PolishRepoImpl;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {
	
	private PolishRepoImpl repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(PolishDTO dto) {
		System.out.println("Running validateAndSave");
		if (dto != null) {
			System.out.println("dto is not null we can save");

//			System.out.println(dto);

			Set<ConstraintViolation<PolishDTO>> ConstraintViolation = validator.validate(dto);

			if (ConstraintViolation != null && !ConstraintViolation.isEmpty()) {
				System.out.println("Total number of violations: " + ConstraintViolation.size());
				ConstraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			}else {
				System.out.println("no constraint violation in dto");
				return this.repo.save(dto);
			}
		} else {
			System.out.println("dto is null we cannot save");
		}

		return false;
	}

}

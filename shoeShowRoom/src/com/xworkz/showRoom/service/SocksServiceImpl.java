package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SocksDTO;
import com.xworkz.showRoom.repo.SocksRepoImpl;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksServiceImpl implements SocksService {

	private SocksRepoImpl repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SocksDTO dto) {
		System.out.println("Running validateAnd Save");
		if (dto != null) {
			System.out.println("dto is not null we can save");

			Set<ConstraintViolation<SocksDTO>> ConstraintViolation = validator.validate(dto);

			if (ConstraintViolation != null && !ConstraintViolation.isEmpty()) {
				System.out.println("Total number of violations: " + ConstraintViolation.size());
				ConstraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			} else {
				System.out.println("no constraint violation in dto");
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}

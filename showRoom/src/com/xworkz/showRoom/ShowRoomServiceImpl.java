package com.xworkz.showRoom;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShowRoomServiceImpl implements ShowRoomService {

	private ShowRoomRepo repo;
	private Validator validator;



	@Override
	public boolean validateAndSave(ShoeShowRoomDTO dto) {
		System.out.println("Running validate and save");
		if (dto != null) {
			System.out.println("dto is not null we can save");
			System.out.println(dto);

			Set<ConstraintViolation<ShoeShowRoomDTO>> ConstraintViolation = validator.validate(dto);

			System.out.println("Total number of violations: " + ConstraintViolation.size());
			ConstraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));

			if (ConstraintViolation != null && ConstraintViolation.isEmpty()) {
				System.out.println("no constraint violation in dto");
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
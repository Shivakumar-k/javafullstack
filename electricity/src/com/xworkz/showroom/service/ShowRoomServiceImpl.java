package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.showroom.dto.ShowRoomDTO;
import com.xworkz.showroom.repo.ShowRoomRepo;



import electricity.com.xworkz.policeStation.util.ValidationUtil;

public class ShowRoomServiceImpl implements ShowRoomService {
	
	private ShowRoomRepo repo;
	
	private ValidationUtil<ShowRoomDTO> validUtil=new ValidationUtil<>();
	
	public ShowRoomServiceImpl(ShowRoomRepo repo) {
		
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ShowRoomDTO dto) {
		System.out.println("Running validate and save ");
		
		if(dto!=null) {
			System.out.println("dto is not null we can save");
			System.out.println(dto);
			
//			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//			javax.validation.Validator validator = factory.getValidator();
//			Set<ConstraintViolation<ShowRoomDTO>> constraintViolations = validator.validate(dto);
//		
//			System.out.println("Total constraints violation:" + constraintViolations.size());
//			constraintViolations.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (!validUtil.validDTO(dto)) {
				System.out.println("No constraintViolations found in dto");
		
		
		return this.repo.save(dto);
			} 
			else {
				System.out.println("DTO is null");
				
			}
		}
		return false;
	}
		

}

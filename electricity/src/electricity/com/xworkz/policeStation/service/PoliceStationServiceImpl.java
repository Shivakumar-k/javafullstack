package electricity.com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import electricity.com.xworkz.policeStation.dto.PoliceStationDTO;
import electricity.com.xworkz.policeStation.repo.PoliceStationRepo;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepo repo;

	public PoliceStationServiceImpl(PoliceStationRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		System.out.println("Running validate and save");
		if(dto!= null) {
			System.out.println("Dto is not null we can save");
			System.out.println(dto);
			
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PoliceStationDTO>> ConstraintViolation = validator.validate(dto);
			
			System.out.println("Total number of violations: "+ConstraintViolation.size());
			ConstraintViolation.forEach(cv->System.out.println(cv.getPropertyPath()+" "+cv.getMessage()));
			
			if(ConstraintViolation != null && ConstraintViolation.isEmpty()){
				System.out.println("no constraint violation in dto");
				return this.repo.save(dto);
			}
			
		}else {
			System.out.println("dto is null");
		}
		return false;
	}

}

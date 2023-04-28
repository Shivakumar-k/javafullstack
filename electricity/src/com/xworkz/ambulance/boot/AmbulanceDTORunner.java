package com.xworkz.ambulance.boot;

import java.time.LocalDate;

import com.xworkz.ambulance.dto.AmbulanceDTO;
import com.xworkz.ambulance.repo.AmbulanceRepo;
import com.xworkz.ambulance.repo.AmbulanceRepoImpl;
import com.xworkz.ambulance.service.AmbulanceService;
import com.xworkz.ambulance.service.AmbulanceServiceImpl;

public class AmbulanceDTORunner {
	
	public static void main(String[] args) {
		//Collection<AmbulanceDTO> ambulanceDTOs = new ArrayList<>();

		AmbulanceDTO dto1= new AmbulanceDTO(1, 10, 15, "Raj", false, "tom", LocalDate.of(2010, 4, 1));
		AmbulanceDTO dto2 = new AmbulanceDTO(2, 12, 11, "ram", false, "jerry", LocalDate.of(2011, 4, 1));

		AmbulanceRepo repository = new AmbulanceRepoImpl();
		AmbulanceService service = new AmbulanceServiceImpl(repository);

		boolean save1 = service.validateAndSave(dto1);
		System.out.println(save1);
		boolean save2 = service.validateAndSave(dto2);
		System.out.println(save2);

	}

}

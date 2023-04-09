package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.repositary.EducationRepository;
import com.xworkz.application.repositary.EducationRepositoryImpl;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImpl;

public class EducationDTORunner {

	public static void main(String[] args) {
		EducationDTO educationDTO1 = new EducationDTO(101, "Shiva", "BE", 67, "VTU", LocalDate.of(2018, 6, 12),
				LocalDate.of(2022, 8, 12), false, "Mech");
		
		EducationDTO educationDTO2 = new EducationDTO(753, "Ranjit", "BE", 69, "VTU", LocalDate.of(2018, 6, 12),
				LocalDate.of(2022, 8, 12), false, "EC");

		EducationDTO educationDTO3 = new EducationDTO(111, "Dinakar", "BCA", 69.9, "kuvempu university",
				LocalDate.of(2019, 7, 12), LocalDate.of(2022, 11, 4), true, "Computer");

		EducationDTO educationDTO4 = new EducationDTO(121, "Nikhil", "BCA", 70, "kuvempu university",
				LocalDate.of(2019, 6, 28), LocalDate.of(2022, 11, 4), true, "Computer");

		EducationRepository repository = new EducationRepositoryImpl();

		EducationService service = new EducationServiceImpl(repository);

		boolean save1 = service.validateAndSave(educationDTO1);
		System.out.println("1st dto is saved" + save1);

		boolean save2 = service.validateAndSave(educationDTO2);
		System.out.println("2nd dto is saved" + save2);

		boolean save3 = service.validateAndSave(educationDTO3);
		System.out.println("3rd dto is saved" + save3);
		
		boolean save4 = service.validateAndSave(educationDTO4);
		System.out.println("4th dto is saved" + save3);

//		boolean bckLog = service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dinakar", "BCA", "kuvempu university");
//		System.out.println(bckLog);

//		int id = service.findidByCandidateNameAndDegreeNameAndUniversity("Shiva", "BE", "VTU");
	//	System.out.println(id);
		
		double Percent = service.findPercentageByCandidateName("Shiva");
		System.out.println(Percent);
	}
}

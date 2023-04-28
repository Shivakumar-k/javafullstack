package com.xworkz.marriage.boot;

import java.time.LocalDate;

import com.xworkz.marriage.dto.MarriageDTO;
import com.xworkz.marriage.repo.MarriageRepo;
import com.xworkz.marriage.repo.MarriageRepoImpl;
import com.xworkz.marriage.service.MarriageService;
import com.xworkz.marriage.service.MarriageServiceImpl;

public class MarriageRunner {
public static void main(String[] args) {
		
		MarriageRepo repository=new MarriageRepoImpl();
		
		MarriageService service=new MarriageServiceImpl(repository);
		
		MarriageDTO dto1= new MarriageDTO(11, "deepika", "Ranveer singh", false, LocalDate.of(2018, 1, 1), "MumbaiConvention", 1800, false);
		boolean save1=service.validateAndSave(dto1);
		System.out.println("DTO1 is saved:"+save1);
		
		MarriageDTO dto2= new MarriageDTO(15, "Kaira", "sidhart", false, LocalDate.of(2023, 3, 3), "Mumbai", 2800, false);
		boolean save2=service.validateAndSave(dto2);
		System.out.println("DTO2 is saved:"+save2);
	}
}

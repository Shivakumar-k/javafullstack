package com.xworkz.crud.god.service;

import com.xworkz.crud.god.GodDTO;
import com.xworkz.crud.god.repo.GodRepo;

import static com.xworkz.crud.god.validation.GodValidation.*;

public class GodServiceImpl implements GodService{
	
	private GodRepo repo;
	
	public GodServiceImpl(GodRepo repo) {
		this.repo=repo;
	}
	

	@Override
	public boolean validateAndSave(GodDTO dto) {
		System.out.println("Running validate and save method");
		if(dto!=null) {
			System.out.println("dto is not null we can validate");
			
			String name = dto.getName();
			String religion = dto.getReligion();
			String knownFor = dto.getKnownFor();
			String festival = dto.getFestival();
			int noOfholidays = dto.getNoOfholidays();
			
			boolean validName = false;
			boolean validReligion = false;
			boolean validKnownFor = false;
			boolean validFestival = false;
			boolean validnoOfHolidays = false;
			
			if(validString(name)) {
				System.out.println("valid Name");
				validName = true;
			}else {
				System.out.println("Invalid Name");
			}
			if(validString(religion)) {
				System.out.println("valid Religion");
				validReligion = true;
			}else {
				System.out.println("Invalid Religion");
			}
			if(validString(knownFor)) {
				System.out.println("valid KnownFor");
				validKnownFor = true;
			}else {
				System.out.println("Invalid KnownFor");
			}
			if(validString(festival)) {
				System.out.println("valid Festival");
				validFestival = true;
			}else {
				System.out.println("Invalid Festival");
			}
			if(validInt(noOfholidays)) {
				System.out.println("valid noOfHolidays ");
				validnoOfHolidays  = true;
			}else {
				System.out.println("valid noOfHolidays ");
			}
			
			if(validFlag(validName,validReligion,validKnownFor,validFestival,validnoOfHolidays )) {
				System.out.println("data is valid we can save the data");
				boolean save = this.repo.save(dto);
				return true;
			}
			else
			{
				System.out.println("data is Invalid we cannot save the data");	
			}
			
		}
		else
		{
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public GodDTO find(GodDTO dto) {
		if(dto != null) {
			return this.repo.find(dto);
		}

		return null;
	}

	@Override
	public GodDTO findByName(String name) {
		if(validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public String findFestvalByNameAndReligion(String name, String religion) {
		if(validString(name) && validString(religion)){
			return this.repo.findFestvalByNameAndReligion(name, religion);
		}
		
		return null;
	}

	@Override
	public int findHolidaysByNameByReligionByFestival(String name, String religion, String festival) {
		if(validString(name)&& validString(religion)&&validString(festival)) {
			System.out.println("valid findHolidaysByNameByReligionByFestival");
			return this.repo.findHolidaysByNameByReligionByFestival(name, religion, festival);
		}
		return 0;
	}

	@Override
	public int total() {
		
		return this.repo.total();
	}
	
	

}

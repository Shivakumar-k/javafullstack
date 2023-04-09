package com.xworkz.crud.god.boot;

import com.xworkz.crud.god.GodDTO;
import com.xworkz.crud.god.repo.GodRepo;
import com.xworkz.crud.god.repo.GodRepoImpl;
import com.xworkz.crud.god.service.GodService;
import com.xworkz.crud.god.service.GodServiceImpl;


public class GodDTORunner {

	public static void main(String[] args) {
		GodRepo godrepo = new GodRepoImpl();
		GodService service = new GodServiceImpl(godrepo);
		
		GodDTO god1 = new GodDTO("Shiva", "Hindu", "Nothingness", "Maha Shivaratri", 1);
		GodDTO god2 = new GodDTO("Hanuman", "Hindu", "Strength", "Hanuma jayanti", 1);
		GodDTO god3 = new GodDTO("Durga Mata", "Hindu", "Evil Destroyer", "Dassara", 10);
		GodDTO god4 = new GodDTO("Krishna", "Hindu", "Maintaining dharma", "Krishna janmaastmi", 1);
		GodDTO god5 = new GodDTO("Ganesh", "Hindu", "Peace", "ganesh jayanti", 1);
		
		
		
		boolean save = service.validateAndSave(god1);
		System.out.println(save);
		
		boolean save1 = service.validateAndSave(god2);
		System.out.println(save1);
		
		boolean save2 = service.validateAndSave(god3);
		System.out.println(save2);
		
		boolean save3 = service.validateAndSave(god4);
		System.out.println(save3);
		
		boolean save4 = service.validateAndSave(god5);
		System.out.println(save4);

		GodDTO save5 = service.find(god1);
		System.out.println(save5);
		
		GodDTO save6 = service.findByName("Shiva");
		System.out.println(save6);
		
		String festival = service.findFestvalByNameAndReligion("Shiva", "Hindu");
		System.out.println("Festival: "+festival);
		
		int holidays= service.findHolidaysByNameByReligionByFestival("Shiva", "Hindu", "Maha Shivaratri");
		System.out.println("Holidays: "+holidays);
		
		GodDTO save7 = service.findByName("Krishna");
		System.out.println(save7);
		
		int holidays1 = service.findHolidaysByNameByReligionByFestival("Krishna", "Hindu", "Krishna janmaastmi");
		System.out.println("Holidays: "+holidays1);
		
		String festival1 = service.findFestvalByNameAndReligion("Krishna", "Hindu");
		System.out.println("Festival: "+festival1);
		
		GodDTO save9 = service.findByName("Hanuman");
		System.out.println(save9);
		
		
		
		

	}

}

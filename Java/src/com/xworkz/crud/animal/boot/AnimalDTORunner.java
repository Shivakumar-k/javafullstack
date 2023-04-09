package com.xworkz.crud.animal.boot;

import com.xworkz.crud.animal.dto.AnimalDTO;
import com.xworkz.crud.animal.repo.AnimalRepo;
import com.xworkz.crud.animal.repo.AnimalRepoImpl;
import com.xworkz.crud.animal.service.AnimalService;
import com.xworkz.crud.animal.service.AnimalServiceImpl;

public class AnimalDTORunner {

	public static void main(String[] args) {

		AnimalDTO animalDTO1 = new AnimalDTO("Tiger", 40, "Forest", "yellow", 105.2);
		AnimalDTO animalDTO2 = new AnimalDTO("whale", 120, "ocean", "blue", 500.5);
		AnimalDTO animalDTO3 = new AnimalDTO("cow", 45, "domestic", "white", 80.0);
		AnimalRepo animalRepo = new AnimalRepoImpl();

		AnimalService service = new AnimalServiceImpl(animalRepo);

		boolean save1 = service.ValidateAndSave(animalDTO1);
		System.out.println(save1);

		AnimalDTO rty = service.findByName("Tiger");
		System.out.println(rty);

		boolean save2 = service.ValidateAndSave(animalDTO2);
		System.out.println(save2);
		boolean save3 = service.ValidateAndSave(animalDTO3);
		System.out.println(save3);

		String rty1 = service.findHabitatByName("whale");
		System.out.println(rty1);
		
		
		int age = service.findLifespanByName("whale");
		System.out.println("lifespan "+age);
		
		

	}

}

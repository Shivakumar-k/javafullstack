package com.xworkz.crud.animal.service;

import com.xworkz.crud.animal.dto.AnimalDTO;
import com.xworkz.crud.animal.repo.AnimalRepo;

import static com.xworkz.crud.animal.validation.AnimalValidation.*;

public class AnimalServiceImpl implements AnimalService {
	
	private AnimalRepo repo;
	
	
	public AnimalServiceImpl(AnimalRepo repo) {
		this.repo=repo;
		
	}

	@Override
	public boolean ValidateAndSave(AnimalDTO dto) {
		System.out.println("Running ValidateAndSave");
		if (dto != null) {
			System.out.println("dto is not null, We can validate");

			String name = dto.getName();
			int lifeSpan = dto.getLifeSpan();
			String habitat = dto.getHabitat();
			String color = dto.getColor();
			double weight = dto.getWeight();

			boolean validName = false;
			boolean validLifeSpan = false;
			boolean validHabitat = false;
			boolean validColor = false;
			boolean validWeight = false;

			if (validString(name)) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.out.println("Invalid name");
			}

			if (validInt(lifeSpan)) {
				System.out.println("Valid lifespan");
				validLifeSpan = true;
			} else {
				System.out.println("Invalid lifeSpan");
			}

			if (validString(habitat)) {
				System.out.println("Valid Habitat");
				validHabitat = true;
			} else {
				System.out.println("Invalid Habitat");
			}

			if (validString(color)) {
				System.out.println("Valid color");
				validColor = true;
			} else {
				System.out.println("Invalid color");
			}
			if (validDouble(weight)) {
				System.out.println("Valid Weight");
				validWeight = true;
			} else {
				System.out.println("Invalid Weight");
			}
			
			if(validFlag(validName,validLifeSpan,validHabitat,validColor,validWeight)) {
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
	public AnimalDTO find(AnimalDTO dto) {
		if(dto != null) {
			return this.repo.find(dto);
		}

		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		if(validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public int findLifespanByName(String name) {
		if(validString(name)) {
			return this.repo.findLifespanByName(name);
		}
	
		return 0;
	}

	@Override
	public String findHabitatByName(String name) {
		if(validString(name)) {
			return this.repo.findHabitatByName(name);
		}
		return null;
	}

	@Override
	public String findNameByLifeSpanAndWeight(int lifeSpan, double weight) {
		if(validInt(lifeSpan) && validDouble(weight)) {
			return this.repo.findNameByLifeSpanAndWeight(lifeSpan, weight);
		}
		return null;
	}

	@Override
	public int total() {
		
		return this.repo.total();
	}

}

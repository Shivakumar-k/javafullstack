package com.xworkz.crud.animal.repo;

import com.xworkz.crud.animal.dto.AnimalDTO;

public class AnimalRepoImpl implements AnimalRepo{
	
	private AnimalDTO[] animal = new AnimalDTO[5];
	private int animalIndex=0;

	@Override
	public boolean save(AnimalDTO dto) {
		
		if(this.animalIndex<this.animal.length) {
			animal[animalIndex]=dto;
			System.out.println("saving is correct");
			animalIndex++;
			return true;
		}
		else {
			System.out.println("Saving is incorrect");
		}
	
		return false;
	}
	

	@Override
	public AnimalDTO find(AnimalDTO dto) {
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref = this.animal[animalIndex];
			if(ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		
		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref = this.animal[animalIndex];
			if(ref. getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}
		
		
		return null;
	}

	@Override
	public int findLifespanByName(String name) {
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref = this.animal[animalIndex];
			if(ref. getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref.getLifeSpan();
			}
		}
		return 0;
	}

	@Override
	public String findHabitatByName(String name) {
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref = this.animal[animalIndex];
			if(ref. getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref.getHabitat();
			}
		}
		return null;
	}

	@Override
	public String findNameByLifeSpanAndWeight(int lifeSpan, double weight) {
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref = this.animal[animalIndex];
			if(ref.getLifeSpan()==lifeSpan && ref.getWeight() == weight ) {
				System.out.println("dto is found for name using weight and lifespan");
				return ref.getName();
			}
		}
		return null;
	}

	@Override
	public int total() {
		
		return this.animalIndex;
	}
	
	

}

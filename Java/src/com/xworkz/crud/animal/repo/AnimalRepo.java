package com.xworkz.crud.animal.repo;

import com.xworkz.crud.animal.dto.AnimalDTO;

public interface AnimalRepo {
	
    boolean save(AnimalDTO dto);
	
	AnimalDTO find(AnimalDTO dto);
	
	AnimalDTO findByName(String name);
	
	int findLifespanByName(String name);
	
	String findHabitatByName(String name);
	
	String findNameByLifeSpanAndWeight(int lifeSpan, double weight);
	
	int total();

}

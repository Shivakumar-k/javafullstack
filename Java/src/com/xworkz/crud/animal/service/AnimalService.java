package com.xworkz.crud.animal.service;

import com.xworkz.crud.animal.dto.AnimalDTO;

public interface AnimalService {
	
	boolean ValidateAndSave(AnimalDTO dto);
	
	AnimalDTO find(AnimalDTO dto);
	
	AnimalDTO findByName(String name);
	
	int findLifespanByName(String name);
	
	String findHabitatByName(String name);
	
	String findNameByLifeSpanAndWeight(int lifeSpan, double weight);
	
	int total();


}

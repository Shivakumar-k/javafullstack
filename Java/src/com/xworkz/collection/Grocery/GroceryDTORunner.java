package com.xworkz.collection.Grocery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GroceryDTORunner {

	public static void main(String[] args) {
		Set<GroceryDTO> groceries = new HashSet<>();
		groceries.add(new GroceryDTO(1, "onion", 42.5, 1));
		groceries.add(new GroceryDTO(2, "tomato", 28.99, 2));
		groceries.add(new GroceryDTO(3, "peas", 80.5, 1));
		groceries.add(new GroceryDTO(4, "rice", 156.9, 2));
		groceries.add(new GroceryDTO(5, "chilli", 80.6, 5));
		groceries.add(new GroceryDTO(5, "chilli", 80.6, 5));

		groceries.forEach(g -> System.out.println(g));

		System.out.println("---------------------------------------------------------------------");

		groceries.stream().collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		
		System.out.println("----------------------------------------------------------");
		
		
		List<GroceryDTO> newGroceries = new ArrayList<>(groceries);
		
		groceries.stream().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		newGroceries.add(new GroceryDTO(6, "bread", 40.0, 1));
		
		System.out.println("------------------------------------------------------------------------");
		newGroceries.forEach(ref->System.out.println(ref));
		
		System.out.println("-------------------------------------------------------------------------");
		newGroceries.set(0, new GroceryDTO(8, "butter", 156.2, 1));
		newGroceries.forEach(ref->System.out.println(ref));
		
		System.out.println("-------------------------------------------------------------------------");
		newGroceries.remove(0);
		newGroceries.forEach(ref->System.out.println(ref));
		
		System.out.println("-------------------------------------------------------------------------");
		newGroceries.addAll(1, groceries);
		newGroceries.forEach(ref->System.out.println(ref));
		
		


	}

}

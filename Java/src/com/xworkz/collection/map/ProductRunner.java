package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ProductRunner {
	
public static void main(String[] args) {
		
		Map<Integer, String> products=new HashMap<>();
		
		products.put(1, "Shoes");
		products.put(2, "Shirt");
		products.put(3, "Pant");
		products.put(4, "T-shirt");
		products.put(5, "HeadPhone");
		products.put(6, "Slippers");
		products.put(7, "Chair");
		products.put(8, "LapTop");
		products.put(9, "Tv");
		products.put(10, "Mobile");
		
		System.out.println(products);
		
		products.remove(2);
		products.remove(3, "Pant");
		products.replace(4, "Pen");
		System.out.println(products);
		
		System.out.println(products.keySet());
		System.out.println(products.values());
		System.out.println(products);
		
		products.clear();
		System.out.println(products);
		
	}

}

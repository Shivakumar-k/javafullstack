package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Alcohol;

public class AlcoholRunner {
	public static void main(String[] args) {
		
		Alcohol alcohol = new Alcohol("Jack Daniel's", 40.0, 1825.99, "Whiskey");
		Alcohol alcohol2 = new Alcohol("Magic Moments", 40.0, 850.99, "Vodka");
		System.out.println(alcohol.equals(alcohol2));
		Alcohol alcohol3 = new Alcohol("Jack Daniel's", 40.0, 1825.99, "Whiskey");
		System.out.println(alcohol.equals(alcohol3));
		

		
		
	}
}

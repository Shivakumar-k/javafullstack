package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Park;

public class ParkRunner {

	public static void main(String[] args) {
		
		Park park = new Park("Eden Garden", "Kolkata", 80.0d, 9.30, false, 600);
		Park park2 = new Park("Cubbon", "Bengluru", 50.0d, 9.00, false, 800);
		System.out.println(park.equals(park2));
		System.out.println(park.toString());
		Park park3 = new Park("Eden Garden", "Kolkata", 80.0d, 9.30, false, 600);
		System.out.println(park.equals(park3));
		

	}

}

package com.xworkz.overloading.thing;

public class Food {
	
	public Food() {
		System.out.println("Running " +getClass().getSimpleName());
	}
	public void foodName(String name) {
		System.out.println("Running foodname String "+name);
	}
	public void foodName(int no) {
		System.out.println("Running foodname no "+no);
	}

}

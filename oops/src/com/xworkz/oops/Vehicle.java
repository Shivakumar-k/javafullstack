package com.xworkz.oops;

public class Vehicle {
	int no=18;

	void start() {
		System.out.println("vehicle Starting...");
	}

	public static void main(String[] args) {
		String v ="virat";
//		v=v.concat("kohli");
		System.out.println(v.concat(" kohli"));//virat
	}

}

class Bike extends Vehicle {

	void start() {
		System.out.println("Bike Starting...");
	}

}

class car extends Vehicle {

	void start() {

		System.out.println("car Starting...");
	}
}

class Demo {

}

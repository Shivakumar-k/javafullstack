package com.xworkz.abstraction.link;

public class Person {

	private Dunzo dunzo;

	public Person(Dunzo dunzo) {
		this.dunzo = dunzo;
	}

	public void display() {

		double charge = dunzo.charges();

		if (charge < 60) {
			System.out.println("charges are okay");
		}
		if (charge > 60) {
			System.out.println("Charges are expensive");
		}

		double time = dunzo.timeTaken();
		if (time <= 30) {
			System.out.println("on time delivery");
		} else {
			System.out.println("Delayed delivery");
		}
	}

}

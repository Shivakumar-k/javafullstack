package com.xworkz.inheritance.chaining;

import com.xworkz.inheritance.thing.objectmanip.WaterFall;

public class Person {

	private int id;
	private String name;
	private int age;
	private String email;

	public Person(int id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;

	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(String name, int id, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Person: " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Person) {
				System.out.println("Object is person can compare");
				Person casted = (Person) obj;
				Person person = this;
				Person person2 = casted;
				if (person.id == person2.id && person.name.equals(person2.name) && person.age == person2.age
						&& person.email.equals(person2.email)) {
					System.out.println("person and person2 is same");
					return true;
				} else {
					System.err.println("person and person2 are not same");
				}
			} else {
				System.out.println("Object is not a person");
			}
		} else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "Id: " + this.id + " Name: " + this.name + " Age: " + this.age + " Email: " + this.email;
	}

	@Override
	public int hashCode() {

		return 123456;
	}
}

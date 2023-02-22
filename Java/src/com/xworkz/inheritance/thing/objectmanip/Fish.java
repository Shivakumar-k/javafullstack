package com.xworkz.inheritance.thing.objectmanip;

public class Fish {
	private String name;
	private String species;
	private double length;
	private boolean isSaltwater;
	private int age;

	public Fish(String name, String species, double length, boolean isSaltwater, int age) {
		this.name = name;
		this.species = species;
		this.length = length;
		this.isSaltwater = isSaltwater;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Park: " + obj);
		if (obj != null) {
			System.out.println("object is not a null");
			if (obj instanceof Fish) {
				System.out.println("Object is park can compare");
				Fish casted = (Fish) obj;
				Fish fish = this;
				Fish fish2 = casted;
				if (fish.name.equals(fish2.name) && fish.species.equals(fish2.species) && fish.length == fish2.length
						&& fish.isSaltwater == fish2.isSaltwater && fish.age == fish2.age) {
					System.out.println("Fish and Fish2 is same");
					return true;
				} else {
					System.err.println("Fish and Fish2 are not same");
				}
			} else {
				System.err.println("Object is not a Fish can't compare");
			}
		} else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.name + " Species: " + this.species + " Length: " + this.length + " is SaltWater: "
				+ this.isSaltwater + " Age: " + this.age;

	}
}

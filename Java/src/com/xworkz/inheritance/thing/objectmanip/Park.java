package com.xworkz.inheritance.thing.objectmanip;

public class Park {

	private String name;
	private String location;
	private double admissionFee;
	private double openingTime;
	private boolean petsAllowed;
	private int numVisitors;

	public Park(String name, String location, double admissionFee, double openingTime, boolean petsAllowed,
			int numVisitors) {
		this.name = name;
		this.location = location;
		this.admissionFee = admissionFee;
		this.openingTime = openingTime;
		this.petsAllowed = petsAllowed;
		this.numVisitors = numVisitors;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Park: " + obj);
		if (obj != null) {
			System.out.println("object is not a null");
			if (obj instanceof Park) {
				System.out.println("Object is park can compare");
				Park casted = (Park) obj;
				Park park = this;
				Park park2 = casted;
				if (park.name.equals(park2.name) && park.location.equals(park2.location)
						&& park.admissionFee == park2.admissionFee && park.openingTime == park2.openingTime
						&& park.petsAllowed == park2.petsAllowed && park.numVisitors == park2.numVisitors) {
					System.out.println("Park and Park2 is same");
					return true;
				} else {
					System.err.println("Park and Park2 are not same");
				}
			} else {
				System.err.println("Object is not a Park can't compare");
			}
		} else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Park Name: " + this.name + " Location: " + this.location + " Location: " + this.location + " Fee: "
				+ this.admissionFee + " Openining Time: " + this.openingTime + " is pets allowed: " + this.petsAllowed
				+ " Maximum Visitors: " + this.numVisitors;
	}
}

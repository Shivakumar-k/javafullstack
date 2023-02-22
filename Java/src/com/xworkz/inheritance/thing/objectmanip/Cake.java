package com.xworkz.inheritance.thing.objectmanip;

public class Cake {
	private String flavour;
	private float weight;
	private String shape;
	private double price;

	public Cake(String flavour, float weight, String shape, double price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Cake) {
				System.out.println("obj is Cake type,can comapre");
				Cake casted = (Cake) obj;
				Cake cake = this;
				Cake cake2 = casted;
				if (cake.flavour.equals(cake2.flavour) & cake.weight == cake2.weight & cake.shape.equals(cake2.shape)
						& cake.price == cake2.price) {
					System.out.println("Cake and Cake2 is same");
					return true;
				} else {
					System.err.println("Cake and Cake2 not same");
				}
			} else {
				System.err.println("obj is not cake,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Flavour: " + this.flavour + " Weight: " + this.weight + " Shape: " + this.shape + " Price: "
				+ this.price;
	}
}

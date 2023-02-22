package com.xworkz.inheritance.thing.objectmanip;

public class Tv {

	private String brand;
	private int size;
	private double price;

	public Tv(String brand, int size, double price) {
		this.brand = brand;
		this.size = size;
		this.price = price;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Tv: " + obj);
		if (obj != null) {
			System.out.println("object is not a null");
			if (obj instanceof Tv) {
				System.out.println("Object is tv can compare");
				Tv casted = (Tv) obj;
				Tv tv = this;
				Tv tv2 = casted;
				if(tv.brand.equals(tv2.brand) && tv.size == tv2.size && tv.price == tv2.price){
					System.out.println("Tv and Tv2 is same");
					return true;
				}
				else {
					System.err.println("Tv and Tv2 are not same");
				}
			} else {
				System.err.println("Object is not a Tv can't compare");
			}
		}else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}
	@Override
	public String toString() {

		return "Brand: "+this.brand+" size: "+this.size+" Price: "+this.price;
	}

}

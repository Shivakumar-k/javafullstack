package com.xworkz.inheritance.thing.objectmanip;

public class Door {

	private String material;
	private double height;
	private int price;
	private boolean hasGlass;

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setHasGlass(boolean hasGlass) {
		this.hasGlass = hasGlass;
	}

	@Override
	public String toString() {

		return "Material: " + this.material + " Height: " + this.height + " Price: " + this.price + " Has Glass: "
				+ this.hasGlass;
	}

	@Override
	public int hashCode() {

		return 545;
	}

}

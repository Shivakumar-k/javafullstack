package com.xworkz.inheritance.thing.objectmanip;

public class Paint {

	private String name;
	private String painter;
	private int year;
	private float price;

	public void setName(String name) {
		this.name = name;
	}

	public void setPainter(String painter) {
		this.painter = painter;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("running toString for paint class");
		return "Paint Name: " + this.name + " Painter name: " + this.painter + " Year: " + this.year + " Price: "
				+ this.price;
	}

	@Override
	public int hashCode() {

		return 5651;
	}
}

package com.xworkz.inheritance.thing.objectmanip;

public class Gold {

	private int karat;
	private double price;
	private String country;
	private boolean isHallmark;

	public void setKarat(int karat) {
		this.karat = karat;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setHallmark(boolean isHallmark) {
		this.isHallmark = isHallmark;
	}

	@Override
	public String toString() {

		return "Karat: " + this.karat + " Price in USD: " + this.price + " Country: " + this.country + " HallMark: "
				+ this.isHallmark;
	}

	@Override
	public int hashCode() {

		return 657;
	}
}

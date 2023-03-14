package com.xworkz.abstraction.link;

public class Abharan implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("gold price per gram");
		return 4855.50;
	}

	@Override
	public String getGstNo() {
		
		return "GSTIN05236";
	}

	@Override
	public String getLocation() {
		
		return "Mysore";
	}

}

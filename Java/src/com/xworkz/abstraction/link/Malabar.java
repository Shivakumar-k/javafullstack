package com.xworkz.abstraction.link;

public class Malabar implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("gold price per gram");
		return 5866.50;
	}

	@Override
	public String getGstNo() {
		return "GSTIN1520";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Bengaluru";
	}

}

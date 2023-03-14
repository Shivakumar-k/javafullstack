package com.xworkz.abstraction.link;

public class Mahalakshmi implements GoldSeller {

	@Override
	public double pricePerGram() {
		// TODO Auto-generated method stub
		System.out.println("gold price per gram");
		return 5299.90;
	}

	@Override
	public String getGstNo() {
		// TODO Auto-generated method stub
		return "GSTIN0560";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Mysuru";
	}

}

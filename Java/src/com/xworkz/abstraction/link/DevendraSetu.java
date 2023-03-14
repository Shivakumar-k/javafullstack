package com.xworkz.abstraction.link;

public class DevendraSetu implements GoldSeller {

	@Override
	public double pricePerGram() {
		// TODO Auto-generated method stub
		System.out.println("gold price per gram");
		return 3536;
	}

	@Override
	public String getGstNo() {
		// TODO Auto-generated method stub
		return "GSTIN31545";
	}

	@Override
	public String getLocation() {
		
		return "Bengaluru";
	}

}

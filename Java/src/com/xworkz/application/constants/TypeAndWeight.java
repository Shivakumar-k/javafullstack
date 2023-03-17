package com.xworkz.application.constants;

public enum TypeAndWeight {
	
WIRED(0.6), WIRELESS(0.4);
	
	private final double weight;
	
	private TypeAndWeight(double weight) {
		
		this.weight=weight;
	}

	public double getWeight() {
		return weight;
	}

}

package com.xworkz.abstraction.link;

public class Rapido implements Delivery {

	@Override
	public double charges() {

		return 40;
	}

	@Override
	public double timeTaken() {

		return 20;
	}

	@Override
	public String agentName(int rating) {
		if(rating==1) {
			return "Basavaraj";
		}
		if(rating == 2) {
			return "Dinakar";
		}
		if(rating == 3) {
			return "Shiva";
		}
		return null;
	}

}

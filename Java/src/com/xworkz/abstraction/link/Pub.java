package com.xworkz.abstraction.link;

public class Pub implements PubRules {

	@Override
	public int minAge() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public String dressCode() {
		
		return "Shoes are compulsory";
	}

	@Override
	public String illegalSubstance() {
		// TODO Auto-generated method stub
		return "illegal substance usage punishable offence ";
	}

	@Override
	public boolean stagEntry() {
	 System.out.println("No stag entry");
		return false;
	}

	@Override
	public boolean dj() {
		
		return true;
	}

}

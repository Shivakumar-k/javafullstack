package com.xworkz.abstraction.link;

public class Airport extends AbstractInfo implements PassportRule,DubaiVisaRule,Developer {

	@Override
	public String followsStandards() {
		System.out.println("Traveller should follow Dubai rules");
		return "Rules given by country should be obeyed and followed";
	}

	@Override
	public boolean understandingConcept() {
		System.out.println(" clear concepts");
		return true;
	}

	@Override
	public int minAmount() {
		System.out.println("Minimum flight charges from India to Dubai");
		return 9517;
	}

	@Override
	public boolean stayingHotel() {
		System.out.println("Traveller stayed in Hotel");
		return false;
	}

	@Override
	public int maxGoldLimit() {
		System.out.println("Traveller can only bring gms of: ");
		return 20;
	}

	@Override
	public String citizen() {
		System.out.println("To get visa to dubai from India he should have: ");
		return "Indian Citizenship with Indian passport";
	}

	@Override
	public int criminalRecords() {
		System.out.println("total criminal records of: ");
		return 0;
	}

	@Override
	public boolean jail() {
		System.out.println("Traveller went to Jail: ");
		return false;
	}

}


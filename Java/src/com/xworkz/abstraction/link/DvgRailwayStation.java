package com.xworkz.abstraction.link;

public class DvgRailwayStation implements RailwayStation {

	@Override
	public int minPlatforms() {
		System.out.println("Minimum platforms");
		
		return 3;
	}

	@Override
	public boolean trainOnTime() {
		System.out.println("Train on time");
		return true;
	}

	@Override
	public String crossingTrack() {
		System.out.println("crossing track ");
		return "will be fined";
	}

	@Override
	public int minCops() {
		System.out.println("Minimum cops in platforms");
		return 20;
	}

	@Override
	public boolean ticket() {
		System.out.println("presence of ticket counter");
		return true;
	}

	@Override
	public int minCoaches() {
		System.out.println("Minimum number of coaches");
		return 15;
	}

	@Override
	public boolean trainSchedule() {
		System.out.println("train timeings");
		return true;
	}

	@Override
	public double parkingArea() {
		System.out.println("Minimum area for parking vehicles");
		return 50.5d;
	}
	@Override
	public String toString() {
		
		return "uy";
	}
	
	

}

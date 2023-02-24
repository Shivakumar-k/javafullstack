package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		PoliceStation policeStation = new PoliceStation(25, 5000, 10, "Rajajinagar", 5, "XYZ", "Bengaluru", 3, 30,
				false);
		PoliceStation policeStation2 = new PoliceStation(50, 10000, 10, "Vijayanagar", 5, "XYZ", "Bengaluru", 3, 30,
				true);
		System.out.println(policeStation.equals(policeStation2));
	}

}

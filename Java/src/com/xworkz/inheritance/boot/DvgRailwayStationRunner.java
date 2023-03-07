package com.xworkz.inheritance.boot;

import com.xworkz.abstraction.link.DvgRailwayStation;
import com.xworkz.abstraction.link.RailwayStation;

public class DvgRailwayStationRunner {

	public static void main(String[] args) {
		DvgRailwayStation dvg = new DvgRailwayStation();
		System.out.println(dvg.minCoaches());
		dvg.crossingTrack();
		dvg.minPlatforms();
		dvg.ticket();
		dvg.trainOnTime();
		dvg.parkingArea();
		dvg.trainSchedule();
		dvg.minCops();
	
		
		System.out.println("---------------");
		
		//Object obj = new DvgRailwayStation();
		
		RailwayStation rail = new DvgRailwayStation();
		rail.minCoaches();
		rail.crossingTrack();
		rail.minPlatforms();
		rail.ticket();
		rail.trainOnTime();
		rail.parkingArea();
		rail.trainSchedule();
		rail.minCops();
		
		System.out.println(rail.hashCode());
		System.out.println(rail.equals(rail));
	}

}

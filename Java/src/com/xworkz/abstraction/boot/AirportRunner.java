package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.link.Airport;

public class AirportRunner {

	public static void main(String[] args) {
		
		Airport port = new Airport();
		System.out.println(port.citizen());
		System.out.println(port.criminalRecords());
		System.out.println(port.followsStandards());
		System.out.println(port.jail());
		System.out.println(port.maxGoldLimit());
		System.out.println(port.minAmount());
		System.out.println(port.stayingHotel());
		System.out.println(port.understandingConcept());
		System.out.println(port);
		
	


	}

}

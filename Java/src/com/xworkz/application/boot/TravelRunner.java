package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelRunner {

	public static void main(String[] args) {
		
		
		TravelDTO travel = new TravelDTO();
		 travel.setDestination("DudhSagar");
		 travel.setStartDAte(LocalDate.of(2023, 01, 02));
		 travel.setEndDAte(LocalDate.of(2023, 05, 02));
		 travel.setNoOfPeople("5");
		 
		 System.out.println(travel.hashCode());
		 System.out.println(travel);
		

	}

}


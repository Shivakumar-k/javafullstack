package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessRunner {
	
	public static void main(String[] args) {
		
		AwarenessDTO aware =new AwarenessDTO();
		
		aware.setAwarenessTopic("cancer Awareness");
		aware.setStartDAte(LocalDate.of(2022, 01, 02));
		aware.setEndDAte(LocalDate.of(2022, 02, 2));
		aware.setTargetAudience("Youth");
		
		System.out.println(aware);
		
	}

}

package com.xworkz.application.boot;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessRunner {
	
	public static void main(String[] args) {
		
		AwarenessDTO aware =new AwarenessDTO();
		
		aware.setAwarenessTopic("cancer Awareness");
		aware.setStartDAte(null);
		aware.setEndDAte(null);;
		aware.setTargetAudience("Youth");
		
		System.out.println(aware);
		
	}

}

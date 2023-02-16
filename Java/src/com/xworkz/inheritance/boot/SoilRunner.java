package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.overRiding.BlackSoil;
import com.xworkz.inheritance.thing.overRiding.Soil;

public class SoilRunner {

	public static void main(String[] args) {
		
		Soil soil = new Soil();
		soil.setMoisture(null);
		
		Soil soil1 = new BlackSoil();
		soil1.setMoisture("wet");
		


	}

}

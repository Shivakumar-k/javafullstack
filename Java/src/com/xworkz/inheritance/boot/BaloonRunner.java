package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.overRiding.Baloon;
import com.xworkz.inheritance.thing.overRiding.HydrogenBaloon;

public class BaloonRunner {

	public static void main(String[] args) {
		
		Baloon baloon = new Baloon();
		baloon.color();
		
		
		Baloon baloon1 = new HydrogenBaloon();
		baloon1.color();


	}

}

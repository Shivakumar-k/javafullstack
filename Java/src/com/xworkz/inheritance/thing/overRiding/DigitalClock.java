package com.xworkz.inheritance.thing.overRiding;

public class DigitalClock extends Clock {
	{
		System.out.println("Start of Digital Clock class");
	}

	@Override
	public void shape() {
		System.out.println("Square");
		//return "Square";


	}
}

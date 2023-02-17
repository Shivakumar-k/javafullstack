package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.overRiding.Clock;
import com.xworkz.inheritance.thing.overRiding.DigitalClock;

public class ClockRunner {
	
	public static void main (String[] args) {
		
		Clock clock = new Clock();
		clock.shape();
		
		Clock clock1 = new DigitalClock();
		clock1.shape();
		
	}

}

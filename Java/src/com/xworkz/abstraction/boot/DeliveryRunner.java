package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.link.Delivery;
import com.xworkz.abstraction.link.Dunzo;
import com.xworkz.inheritance.chaining.Person;

public class DeliveryRunner {
	public static void main(String[] args) {
		
		Delivery delivery = new Dunzo();
		System.out.println(delivery.charges());
		System.out.println(delivery.timeTaken());
		System.out.println(delivery.agentName(2));
		

		
		

		
	}

}

package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.FootWare;

public class FootWareRunner {
	public static void main(String[] args) {
		FootWare footWare = new FootWare("Woodland", 8, "Sandanls");
		FootWare footWare2 = new FootWare("Crocs", 7, "Flipflops");
		System.out.println(footWare.equals(footWare2));
		System.out.println(footWare.toString());
		FootWare footWare3 = new FootWare("Woodland", 8, "Sandanls");
		System.out.println(footWare.equals(footWare3));
		
	}

}

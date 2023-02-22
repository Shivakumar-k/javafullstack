package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		Cake cake = new Cake("BlackCurrent", 1000, "Square", 450.99f);
		Cake cake2 = new Cake("Red Velvet", 500, "Round", 350.50f);
		System.out.println(cake.equals(cake2));
		Cake cake3 = new Cake("Red Velvet", 500, "Round", 350.50f);
		System.out.println(cake2.equals(cake3));
	}

}


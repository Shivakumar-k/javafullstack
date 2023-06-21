package com.xworkz.overloading.boot;

import com.xworkz.overloading.thing.Food;

public class FoodRunner {

	public static void main(String[] args) {
		Food f = new Food();
		f.foodName("idly");
		System.out.println("-------------------");
		f.foodName(9);

	}

}

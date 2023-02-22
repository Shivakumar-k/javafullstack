package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge = new Fridge("Samsung", "RF28R7351SR", "Stainless Steel", 70, 35, 36, 28, true, true, true, 4, true);
		Fridge fridge2 = new Fridge("LG", "LRMVS3006S", "Matte Black Stainless Steel", 30, 20, 20, 18, false, true, false, 3, false);
		System.out.println(fridge.equals(fridge2));
		Fridge fridge3 = new Fridge("Samsung", "RF28R7351SR", "Stainless Steel", 70, 35, 36, 28, true, true, true, 4, true);
		System.out.println(fridge.equals(fridge3));
		

	}
}

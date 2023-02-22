package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Fish;

public class FishRunner {
	
	public static void main(String[] args) {
		 Fish fish = new Fish("Nemo", "GoldFish", 3.7, true, 1);
		 Fish fish2 = new Fish("Sam", "ClownFish", 24.5, false, 3);
		 System.out.println(fish.equals(fish2));
		 Fish fish3 = new Fish("Nemo", "GoldFish", 3.7, true, 1);
		 System.out.println(fish.equals(fish3));
	}

}

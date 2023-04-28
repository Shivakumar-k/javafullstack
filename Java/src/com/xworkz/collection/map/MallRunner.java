package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MallRunner {
	
	public static void main(String[] args) {

		Map<Integer, String> malls = new HashMap<>();

		malls.put(1, "Orion");
		malls.put(2, "Mantri Sqare");
		malls.put(3, "Gt World");
		malls.put(4, "Banglore Central");
		malls.put(5, "Golden Heights");
		malls.put(6, "Palace Mall");
		malls.put(7, "Gopalan Innovation");
		malls.put(8, "City Center");
		malls.put(9, "UB City");
		malls.put(10, "UG Mall");

		System.out.println(malls);

		malls.remove(4);
		malls.remove(5, "Golden Heights");
		malls.replace(8, "Forum Mall");
		System.out.println(malls);

		System.out.println(malls.values());
		System.out.println(malls.keySet());
		System.out.println(malls.entrySet());

		malls.clear();
		System.out.println(malls);

	}

}

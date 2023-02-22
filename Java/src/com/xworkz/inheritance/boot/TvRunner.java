package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Tv;

public class TvRunner {
	public static void main(String[] args) {
		
		Tv tv = new Tv("Sony", 36, 42500.0d);
		Tv tv2 = new Tv("LG", 40, 48500.0d);
		System.out.println(tv.equals(tv2));
		System.out.println(tv.toString());
		Tv tv3 = new Tv("Sony", 36, 42500.0d);
		System.out.println(tv.equals(tv3));
		
			
		
		
	}

}

package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold = new Gold();
		gold.setKarat(24);
		gold.setPrice(453.5d);
		gold.setCountry("India");
		gold.setHallmark(true);

		Gold gold2 = new Gold();
		gold2.setKarat(22);
		gold2.setPrice(300.0d);
		gold2.setCountry("USA");
		gold2.setHallmark(true);

		System.out.println(gold);
		System.out.println(gold.hashCode() + " original hashCode :" + System.identityHashCode(gold));
		System.out.println(gold.equals(gold2));
		gold = gold2;
		System.out.println(gold2);
		System.out.println(gold2.hashCode() + " original hashCode :" + System.identityHashCode(gold2));
		System.out.println(gold.equals(gold2));

	}
}

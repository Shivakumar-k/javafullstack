package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.objectmanip.Coconut;

public class CoconutRunner {
	
	public static void main(String[] args) {
	
	Coconut coconut = new Coconut();
	coconut.setPrice(40);
	coconut.setLoacation("Mysore");
	coconut.setSweet(true);
	coconut.setSize("Medium");
	
	
	Coconut coconut2 = new Coconut();
	coconut2.setPrice(50);
	coconut2.setLoacation("Manglore");
	coconut2.setSweet(true);
	coconut2.setSize("large");
	
	
	System.out.println(coconut);
	System.out.println(coconut.hashCode()+" original hashCode :"+System.identityHashCode(coconut));
	System.out.println(coconut.equals(coconut2));
	coconut=coconut2;
	System.out.println(coconut2);
	System.out.println(coconut2.hashCode()+" original hashCode :"+System.identityHashCode(coconut2));
	System.out.println(coconut.equals(coconut2));

	

}
}
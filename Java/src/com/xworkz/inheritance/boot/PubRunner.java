package com.xworkz.inheritance.boot;

import com.xworkz.abstraction.link.Pub;
import com.xworkz.abstraction.link.PubRules;

public class PubRunner {
	public static void main(String[] args) {
		
		Pub pub = new Pub();
		System.out.println(pub.dressCode());
		System.out.println(pub.dj());
		System.out.println(pub.illegalSubstance());
		System.out.println(pub.minAge());
		System.out.println(pub.stagEntry());
		
		
		
		System.out.println("----------------");
		
		
		PubRules  p = new Pub();
		System.out.println(p.dressCode());
		System.out.println(p.dj());
		System.out.println(p.illegalSubstance());
		System.out.println(p.minAge());
		System.out.println(p.stagEntry());
		
		System.out.println(p.hashCode());
		System.out.println(p.equals(p));
		
	}

}

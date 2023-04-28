package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PartiesRunner {

	public static void main(String[] args) {
		
		Collection <String> parties = new ArrayList<String>();
		parties.add("Bjp");
		parties.add("Congress");
		parties.add("JDS");
		parties.add("jdu");
		parties.add("AAP");
		
//		for (String ref:parties) {
//			System.out.println(ref);
//		}
		
		parties.forEach(e->System.out.println(e));
		
		System.out.println("parties in uppercase: ");
		
		parties.stream().map(ref->ref.toUpperCase()).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
	}

}

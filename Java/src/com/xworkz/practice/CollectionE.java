package com.xworkz.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionE {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();
		System.out.println(a.size());
		a.add("ram");
		a.add("raj");
		a.add("rohit");
		a.add("raghu");

		System.out.println(a.size());
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a.set(0, "Raj"));
		System.out.println(a.get(0));
		System.out.println(a.iterator());

		Iterator iterator = a.iterator();
		while (iterator.hasNext()) {
			Object i = iterator.next();
			System.out.println(i);
		}

	}

}

package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Names {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<String>();
		System.out.println("Running isEmpty() method");
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
		System.out.println("Running contains method");
		boolean check = names.contains("Shiva");
		System.out.println("Before Adding: " + check);
		names.add("Shiva");
		names.add("Ranjit");
		names.add("Sunil");
		names.add("sagar");

		boolean isEmpty1 = names.isEmpty();
		System.out.println(isEmpty1);
		boolean checks = names.contains("Shiva");
		System.out.println("After Adding: " + checks);

		System.out.println("size: " + names.size());

		for (String member : names) {

			if (Objects.nonNull(member)) {
				System.out.println(member);
			}
		}
		System.out.println("size: " + names.size());

		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			String member = namesIterator.next();
			{
				if (Objects.isNull(member)) {
					namesIterator.remove();
				}
			}  
		}

		System.out.println(names);
		System.out.println(names.size());

	}

}
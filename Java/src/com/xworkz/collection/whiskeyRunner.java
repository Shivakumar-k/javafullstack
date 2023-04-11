package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class whiskeyRunner {

	public static void main(String[] args) {

		Collection<String> whiskey = new ArrayList<>();
		whiskey.add("Black Dog");
		whiskey.add("IB");
		whiskey.add("Black & white");
		whiskey.add("100 pipers");
		whiskey.add("jack daniels");
		whiskey.add("Johnny walker");
		whiskey.add("Amrut");
		whiskey.add("Teachers");
		whiskey.add("8 PM");
		whiskey.add("chivas");
		whiskey.add(null);

		System.out.println("running for each loop");

		for (String member : whiskey) {

			if (Objects.nonNull(member)) {
				System.out.println(member);
			}
		}
		System.out.println("size: " + whiskey.size());

		Iterator<String> castIterator = whiskey.iterator();
		while (castIterator.hasNext()) {
			String member = castIterator.next();
			{
				if (Objects.isNull(member)) {
					castIterator.remove();
					System.out.println("After remove: " + whiskey);
					System.out.println("After remove size : " + whiskey.size());
				}
			}
		}

	}

}

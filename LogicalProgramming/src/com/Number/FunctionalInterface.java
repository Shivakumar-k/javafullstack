package com.Number;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

interface Addable {
	int addtion(int a, int b);
}

public class FunctionalInterface {
	public static void main(String[] args) {
//		Addable add = (a, b) -> (a + b);
//		int res = add.addtion(2, 5);
//		System.out.println(res);
//		
//		Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
//		System.out.println(supplier.get());

		List<String> snacks = new ArrayList<>();
		snacks.add("chips");
		snacks.add("bhel");
		snacks.add("gobi");
		snacks.add("mirchi");
		snacks.add("panipuri");

		List<String> snack = snacks.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> sortedList = snacks.stream().sorted((o1, o2) -> (o2.compareTo(o1))).collect(Collectors.toList());
		List<String> snacky = snacks.stream().sorted().collect(Collectors.toList());
		System.out.println(snacky);
		System.out.println(sortedList);
		System.out.println(snack);

	}

}

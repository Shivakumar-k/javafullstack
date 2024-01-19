package com.Number;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		int[] num = { 2, 5, 6, 3, 4, 5, 6 };

		Integer n = Arrays.stream(num).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(n);

		int[] arr1 = { 1, 2, 3, 4, 5, 5 };
		int[] arr2 = { 4, 5, 5, 6, 7, 5 };

		List<Integer> l = Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> x == y)).boxed().distinct()
				.collect(Collectors.toList());
		System.out.println(l);

		String[] strArr = { "webtechnology", "java", "spring", "hibernate" };

		String ls = Arrays.stream(strArr).reduce((w1, w2) -> (w1.length() > w2.length() ? w1 : w2)).get();
		System.out.println(ls);

	// Arrays.stream(strArr).mapToInt(x->x.length()).boxed().sorted().max(x.length()).get();

		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

		Map<String, Long> nameCount = names.stream().filter(x -> Collections.frequency(names, x) == 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(nameCount);

		Arrays.stream(num).max().getAsInt();

		String s = "shiva kumar karuR";

		Map<String, Long> wordCount = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(wordCount);

		Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> x == y));

	}

}

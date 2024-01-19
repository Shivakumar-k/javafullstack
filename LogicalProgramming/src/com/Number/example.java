package com.Number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;

import java.util.Set;

import java.util.function.Function;
import java.util.stream.Collectors;

public class example {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,14,6,6,5,2,2);
		Set<Integer> setNum = new HashSet<>();
	

		System.out.println(numbers);

		List<Integer> evenNum = numbers.stream().filter(n -> n % 2 == 0).distinct().collect(Collectors.toList());
		System.out.println(evenNum);

	int num = 45;
		String strN = String.valueOf(num);
		System.out.println(num);

		numbers.stream().map(n -> String.valueOf(n)).filter(s -> s.startsWith("1")).forEach(System.out::println);

		System.out.println("duplicate elements in a integers");
		System.out.println("------");
		numbers.stream().filter(n -> !setNum.add(n)).forEach(System.out::println);
		System.out.println("------");
		long firstInt = numbers.stream().max(Integer::compare).orElseGet(() -> -1);
		System.out.println("max "+firstInt);

		String a = "ShivaKumarkarur";
		String[] b = a.split("");

		Map<String, Long> results = Arrays.stream(b)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(results);

		Arrays.stream(a.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		List<String> duplicates = results.entrySet().stream().filter(i -> i.getValue() > 1).map(x -> x.getKey())
				.collect(Collectors.toList());
		System.out.println(duplicates.get(0));

		String firstNonRepeat = results.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
		System.out.println(firstNonRepeat);

		int[] no = { 11, 22, 13, 41, 15, 6 };

		Integer sorted = Arrays.stream(no).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(sorted);

		String[] strArr = { "java", "spring", "hibernate" };

		String longestArray = Arrays.stream(strArr)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestArray);

		List<String> one = Arrays.stream(no).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(one);

		String lE = Arrays.stream(strArr).reduce((e, f) -> e.length() > f.length() ? e : f).get();
		
		int max=Arrays.stream(no).summaryStatistics().getMax();
		System.out.println("max== "+max);

	}

}

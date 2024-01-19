package com.string;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("It is an Anagram");
		} else {
			System.out.println("it is not an Anagram");
		}
	}
}

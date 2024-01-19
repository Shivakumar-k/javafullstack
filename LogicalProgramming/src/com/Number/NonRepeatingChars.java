package com.Number;

import java.util.Scanner;

public class NonRepeatingChars {

	public static int getIndex(String s) {
		System.out.println("getIndex");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println("non repeting: "+c);
				
				return i;
			} 
		}
		System.out.println("all characters are repeating");
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "aaaa";

		int result=NonRepeatingChars.getIndex(s);
		System.out.println("returned index: "+result);
	}

}

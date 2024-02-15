package com.Number;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String original = scan.nextLine();
		reverseString(original);
	}

	private static void reverseString(String original) {
		String[] words=original.split(" ");
		StringBuilder rev= new StringBuilder();
		for(String word:words) {
			StringBuilder sb = new StringBuilder(word);
			rev.append(sb.reverse());
			rev.append(" ");
		}
		display(original,rev.toString());
		
	}

	private static void display(String original, String reverse) {
		System.out.println(original);
		System.out.println(reverse);
		
		
	}
	

}

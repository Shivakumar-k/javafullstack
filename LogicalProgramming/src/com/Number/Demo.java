package com.Number;

/*
Printing all the palindromes in a substring

*/
public class Demo {
	public static void main(String[] args) {
	System.out.println(compression("aaabbccc")); 

	}

	public static String compression(String str) {
		String s =str.substring(0, 1);
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr!=prev) {
				s+=curr;
			}
			
		}
		return s;
	}

	private static boolean isPlaindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {

				return false;

			}
			i++;
			j--;
		}
		return true;
	}


}

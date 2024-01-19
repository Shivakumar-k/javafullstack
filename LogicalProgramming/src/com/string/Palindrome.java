package com.string;

public class Palindrome {
	public static void main(String[] args) {
		String str="madam";
		String revStr="";
		for(int i = str.length()-1;i>=0;i--) {
			revStr+=str.charAt(i);
		}
		System.out.println(revStr);
		
		if(str.contentEquals(revStr))
			System.out.println("palindrome");
		else {
			System.out.println("not a palindrome");
		}
	}

//	public static void main(String[] args) {
//		String str = "abcdcba";
//		
//		int i = 0, j = str.length()-1;
//
//		while (i < j) {
//			if (str.charAt(i) != str.charAt(j)) {
//				System.out.println("Not palindrome");
//				System.exit(0);
//			}
//
//			i++;
//			j--;
//		}
//		System.out.println("Palindrome");
//	}
}

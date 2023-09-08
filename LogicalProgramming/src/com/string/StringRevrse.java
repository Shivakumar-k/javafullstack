package com.string;

import java.util.Scanner;

public class StringRevrse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		
		String str = scan.next();
		//string is converted to character array and stored in array
		
	  char[] chr=str.toCharArray();
	  //using for loop reverse char array is printed
	  for (int j = chr.length-1; j >=0 ; j--) {
		  System.out.print(chr[j]);
		
	}
	  System.out.println("------------------------------------------------------");
	//approach 2
	  for (int i = str.length()-1; i >=0; i--) {
		System.out.print(str.charAt(i));
		
	}
	  System.out.println("------------------------------------------------------");
	//approach 3
	  StringBuffer sb = new StringBuffer(str);
	  System.out.println(sb.reverse());
	  
	  System.out.println("******************************************************");
	  //approach 4
	  StringBuilder builder =  new StringBuilder(str);
	  System.out.println(builder.reverse());
	}

}

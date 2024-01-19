package com.string;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=s.nextLine().toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch);
				count++;
			}
			
		}
		System.out.println("Number of vowels: "+count);

	}

}

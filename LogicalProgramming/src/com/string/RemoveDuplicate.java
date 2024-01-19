package com.string;

import java.util.*;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str ="Programming";
		System.out.println("Original string "+str);
		System.out.println("without duplicates: "+removeDuplicates(str));
//		System.out.println(str.charAt(0));
	}

	static String removeDuplicates(String str) {
		System.out.println("Inside removeDuplicates");
		String newStr="";
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(newStr.indexOf(ch)==-1) 
			{
				newStr+=ch;
				//newStr=newStr+ch;
			}
		}
		
		return newStr;

	}
}

//		Set<Character> set = new LinkedHashSet();
//		for(int i =0;i<str.length();i++) {
//		set.add(str.charAt(i));
//		}
//		
//		System.out.println(set);

//		String str = "programming";
//		
//		StringBuilder builder = new StringBuilder(str);
//		
//		str.chars().distinct().forEach(c->builder.append((char)c));
//		System.out.println(builder);
//		
//		System.out.println(str.chars());

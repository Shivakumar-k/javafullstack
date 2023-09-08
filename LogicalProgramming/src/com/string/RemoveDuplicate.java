package com.string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "programming";
		
		StringBuilder builder = new StringBuilder(str);
		
		str.chars().distinct().forEach(c->builder.append((char)c));
		System.out.println(builder);

	}

}

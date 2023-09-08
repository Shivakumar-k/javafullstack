package com.string;

public class RempoveSpclChar {

	public static void main(String[] args) {
		String str = "S  hi V   a";
		
	//	\\s is a uniCode for white space
     // String rep=str.replaceAll("^[a-zA-Z0-9],"");
		String rep=str.replaceAll("\\s","");
		
		
		
		System.out.println(rep);

	}

}

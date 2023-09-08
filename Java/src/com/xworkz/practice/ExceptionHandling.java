package com.xworkz.practice;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a = scan.nextInt();

		System.out.println("Enter a number: ");
		int b = scan.nextInt();

		try {

			System.out.println("Answer: " + a / b);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getLocalizedMessage());
			System.out.println("we can't divide number by zero");
		}

		finally 
		{
			System.out.println("inside finally block");
		}
		scan.close();
		
		System.out.println("end");

	}

}

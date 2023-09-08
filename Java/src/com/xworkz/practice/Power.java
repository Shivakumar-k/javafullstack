package com.xworkz.practice;

import java.util.Scanner;

public class Power {

	int pow(int base, int exp) throws Exception {
		int res = 1;

		for (int i = 1; i <= exp; i++) {
			res = res * base;
		}
		return res;
	}

	public static void main(String[] args) {
		Power p = new Power();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base value");
		int base = scan.nextInt();
		System.out.println("Enter exponential value");
		int exp = scan.nextInt();
		

		try {
			int result = p.pow(base, exp);
			System.out.println(result);
		} catch (Exception e) {

			e.printStackTrace();
		}

		scan.close();
	}
}

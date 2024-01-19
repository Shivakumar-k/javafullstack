package com.Number;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
//		if(a%2==0) {
//			System.out.println("it gets completly divided by 2");
//		}else {
//			System.out.println("not divisible");
//		}
//		int max=a%10;
//		while(a>0) {
//			int rem=a%10;
//			if (rem>max) {
//				max=rem;	
//			}
//			a=a/10;
//		}
//		System.out.println(max);
//		int rem=a%10,rev=0;
//		while(a>0) {
//			 rev=(rev*10)+rem;
//		}
//		a=a/10;
//		System.out.println(rev);
		int rev=0;
//		while(n!=0) {
//			rev=n%10;
//			System.out.print(rev);
//			n=n/10;
//		}
		while(n!=0) {
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		System.out.println(rev);
	}


	

}

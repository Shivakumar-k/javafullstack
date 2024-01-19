package com.Number;

public class RevNumber {

	public static void main(String[] args) {
		int n=153,rev=0;
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

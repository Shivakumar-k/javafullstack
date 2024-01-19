package com.Number;

public class GreaterNum {

	public static void main(String[] args) {
		int n =1563,max=n%10;
		while(n>0) {
			int rem=n%10;
			if(rem>max) {
				max=rem;
			}
			n=n/10;
		}
		System.out.println(max);
	}

}

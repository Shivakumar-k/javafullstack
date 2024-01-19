package com.string;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 2, 2, 5, 8, 5, 9, 6 };
		Arrays.sort(a);

//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}

		for (int num : a) {

			System.out.println(num + " ");
		}

	}

}

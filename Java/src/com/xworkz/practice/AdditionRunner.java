
package com.xworkz.practice;

class AdditionRunner {

	public static void main(String[] args) {
		Addition add = (int a, int b) -> (a + b);
		int result = add.add(20, 40);
		System.out.println(result);
		
		Addition sub = (x, y ) -> (x-y);
		int res= sub.add(30, 10);
		System.out.println(res);

	}

}

package com.xworkz.practice;

public class Throws {

	void div() throws ArithmeticException {

		System.out.println(10 / 0);

	}

	public static void main(String[] args) {
		System.out.println("start");

		Throws t = new Throws();

//		try {
		t.div();

		// } catch (Exception e) {
		// System.out.println("exception handled");
		// }

		System.out.println("end");
	}
}

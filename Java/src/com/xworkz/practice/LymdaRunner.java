package com.xworkz.practice;

public class LymdaRunner {

	public static void main(String[] args) {
//		LymdaInterface rectangle = () ->System.out.println("rectangleee");
//		rectangle.shape();
//	
//		//LymdaInterface circle;// = () ->System.out.println("Circle");
//		//circle.shape();
//		
//		LymdaInterface square = () -> System.out.println("Square");
//		square.shape();
		
		
		//passing  lymda expression as parameter to a method
		print(() -> System.out.println("Circle") );
		print(() -> System.out.println("oval"));

	}
	
	private static void print(LymdaInterface interface1) {
	           interface1.shape();
	}

}

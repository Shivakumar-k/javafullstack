package com.xworkz.practice;

import java.util.Scanner;

public class loginform {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter User Id:");
		String id = scan.next();
		System.out.println("Enter Password:");
		int password = scan.nextInt();
		if(id.equalsIgnoreCase("admin")) {
			if (password==123) {
				System.out.println("logged in succesfully");
			}else {
				try {
					throw new InvalidPasswordException();
					
				} catch (InvalidPasswordException e) {
					System.out.println("enter password correctly");
				}
				
			}
			
			
		}else {
			System.out.println("invalid id");
		}
		
		scan.close();


	}

}

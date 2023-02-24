package com.xworkz.inheritance.chaining;

public class Engineer extends Person {

	public Engineer(int id, String name,int age,String email) {
		super(id, name, age, email);
	}
	
	public Engineer(int id, String name) {
		super( id, name);
		
	}
	
	public Engineer(String name, int id, String email) {
		super(name, id, email);
	}
	
	
	
	
	

}

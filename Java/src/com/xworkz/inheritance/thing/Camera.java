package com.xworkz.inheritance.thing;

public class Camera {


	private String brand;
	
	
	
	public Camera() {
		System.out.println("no arg constructor");
	}
	
	public Camera(String brand) {
		this.brand=brand;
		System.out.println("with arg constructor");
	}
	
	public void operate() {

		System.out.println("Brand name:" +brand);
		
	}
	public String getBrand() {
		return brand;
	}

		
	}
	


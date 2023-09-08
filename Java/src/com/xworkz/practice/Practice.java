package com.xworkz.practice;

public class Practice {
	
	String name;
	int age;
	float height;
	
	public Practice(String name, int age, float height) {
		
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Practice() {
		
	}

	@Override
	public String toString() {
		return "practice [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	public static void main(String[] args) {
		Practice p = new Practice("Shiva", 23, 5.6f);
		System.out.println(p);
		System.out.println(new Practice("raj", 22, 6.2f));
		Practice pa = new Practice();
		System.out.println(pa);
	}
	

}

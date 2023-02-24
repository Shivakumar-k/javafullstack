package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.chaining.Doctor;
import com.xworkz.inheritance.chaining.Engineer;

public class PersonRunner {
	public static void main(String[] args) {
		Engineer engineer = new Engineer(12345, "Shiva", 22, "Shiva@gmail.com");
		
		Engineer engineer2 = new Engineer(12345, "Shiva");
		System.out.println(engineer.equals(engineer2));
		System.out.println(engineer.equals(engineer));
		System.out.println(engineer.hashCode()+" Original hashCode: "+System.identityHashCode(engineer));
		
		
		Doctor doctor = new Doctor(45523, "Tom",25, "Tom@gmail.com", "Neuro Surgon", "Appolo" );
		Doctor doctor2 = new Doctor(52634, "Raj",25, "Raj@gmail.com", "eye Surgon", "Vassan" );
		System.out.println(doctor.equals(doctor2));
		System.out.println(doctor.equals(doctor));
		System.out.println(doctor.hashCode()+" Original hashCode: "+System.identityHashCode(doctor));
		
		System.out.println(doctor.equals(engineer));
		

		
	}
	
	

}

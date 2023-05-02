package com.xworkz.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.thing")
public class StringConfigure {
	
	public StringConfigure() {
		System.out.println("No-arg constructor");
	}
	
	@Bean
	public String name() {
		System.out.println("registering Name");
		return "Shiva";
	}
	@Bean
	public String nativePlace() {
		System.out.println("registering nativePlace");
		return "Ballari";
	}
	@Bean
	public String email() {
		System.out.println("registering email...");
		return "shiva.xworkz@gmail.com";
	}
	@Bean
	public String address() {
		System.out.println("registering address...");
		return "Basavaveshwara nagar";
	}
	@Bean
	public String college() {
		System.out.println("registering college...");
		return "BIET";
	}
	@Bean
	public String branch() {
		System.out.println("registering branch");
		return "Mech";
	}
	@Bean
	public String collegeAddress() {
		System.out.println("registering  collegeAddress");
		return "Davangere";
	}
	@Bean
	public String localAddress() {
		System.out.println("registering localAddress ");
		return "Rajajinagar";
	}
	@Bean
	public String schoolName() {
		System.out.println("registering schoolName ");
		return "Nalanda";
	}
	@Bean
	public String schoolLocation() {
		return "Ballari";
		
	}
	
	@Bean
	public String laptop() {
		System.out.println("registering laptop");
		return "Dell";
	}
	
	@Bean
	public String mobile() {
		System.out.println("registering mobile");
		return "pixel";
	}

}

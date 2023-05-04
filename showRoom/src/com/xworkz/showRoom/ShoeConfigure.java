package com.xworkz.showRoom;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.showRoom")
public class ShoeConfigure {
	
	public ShoeConfigure() {
	}
	@Bean
	public Validator validator() {
		System.out.println("registering validator");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}
	
	

}

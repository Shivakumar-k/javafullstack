package com.xworkz.food.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food.controller")
public class FoodConfigure {
	public FoodConfigure() {
		System.out.println("running  FoodConfigure...");
	}
}

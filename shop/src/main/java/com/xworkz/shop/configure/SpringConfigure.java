package com.xworkz.shop.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.shop.controller")
public class SpringConfigure {
	
	public SpringConfigure() {
		System.out.println("Running SpringConfigure");
	}

}

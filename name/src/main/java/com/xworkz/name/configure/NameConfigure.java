package com.xworkz.name.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.name.controller")
public class NameConfigure {
	
	public NameConfigure() {
		System.out.println("running NameConfigure no-arg  const");
	}

}

package com.xworkz.info.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.info.controller")
public class InfoConfigure {
	
	public InfoConfigure() {
		System.out.println("Running InfoConfigure");
	}

}

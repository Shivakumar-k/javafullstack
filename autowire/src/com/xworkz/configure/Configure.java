package com.xworkz.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.thing")
public class Configure {
	
	public Configure() {
		System.out.println("no-arg const");
	}
     @Bean
	public String ThingName() {
		System.out.println("registering thingName");
		return "Paintings";
	}
     @Bean
    public String name() {
		return "Sunil";
    	
    }
     @Bean
    public String guideName() {
    	return "Sagar";
    }
     @Bean
    public String brand() {
    	return "Canon";
    }
     @Bean
    public String type() {
		return "ultrasonic sensors";
    	
    }
     @Bean
    public int fee() {
		return 500;
    	
    }
     @Bean
    public String musuemName() {
		return "British Musuem";
		

	}
    
    
    
    
    
    
    
    
    
    
    
    
}

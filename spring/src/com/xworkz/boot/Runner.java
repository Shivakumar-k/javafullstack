package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfigure;
import com.xworkz.thing.Rocket;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext  context= new AnnotationConfigApplicationContext(SpringConfigure.class);
		
		Rocket ref= context.getBean(Rocket.class);
		System.out.println(ref);
		
		System.out.println(ref.rocketName());
	
		
		
		
		
		
		
		
		
		
		

	}

}

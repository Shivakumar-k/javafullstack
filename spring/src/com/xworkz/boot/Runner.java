package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfigure;
import com.xworkz.thing.Rocket;





public class Runner {

	public static void main(String[] args) {
		ApplicationContext  context= new AnnotationConfigApplicationContext(SpringConfigure.class);
		
		int beanDefinitionCount = context.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
		
	//	System.out.println(context.getBean(Rocket.class));
		
		Rocket ref= context.getBean(Rocket.class);
		System.out.println(ref);
		
		System.out.println(ref.rocketName());
		
		System.out.println(ref.type());
		
		
		System.out.println(ref.cost());
		
		System.out.println(ref.payLoad());
		
		
		
		
		
		
		
		
		
		

	}

}

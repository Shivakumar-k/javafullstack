package com.xworkz.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.Configure;
import com.xworkz.thing.Musuem;


public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configure.class);

		System.out.println(spring.getBeanDefinitionCount());

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

//  	Thing ref=spring.getBean(Thing.class);
//		System.out.println(ref);

//		Security ref1=spring.getBean(Security .class);
//		System.out.println(ref1);
////		
//		Guide ref2=spring.getBean(Guide .class);
//		System.out.println(ref2);

//		Camera ref1=spring.getBean(Camera.class);
//		System.out.println(ref1);

//		SensoredDoor ref1=spring.getBean(SensoredDoor.class);
//		System.out.println(ref1);

//		EntryFee ref1=spring.getBean(EntryFee.class);
//		System.out.println(ref1);

		Musuem ref1 = spring.getBean(Musuem.class);
		System.out.println(ref1);

	}

}

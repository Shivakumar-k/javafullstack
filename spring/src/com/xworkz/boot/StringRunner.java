package com.xworkz.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.StringConfigure;

public class StringRunner {

	public static void main(String[] args) {
		ApplicationContext string = new AnnotationConfigApplicationContext(StringConfigure.class);

//		Stream.of(string.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("Total Beans count : " + string.getBeanDefinitionCount());

		System.out.println("---------------------String Type--------------------------------");
		System.out.println(string.getBean("name", String.class));
		System.out.println(string.getBean("nativePlace", String.class));
		System.out.println(string.getBean("email", String.class));
		System.out.println(string.getBean("address", String.class));
		System.out.println(string.getBean("college", String.class));
		System.out.println(string.getBean("branch", String.class));
		System.out.println(string.getBean("collegeAddress", String.class));
		System.out.println(string.getBean("localAddress", String.class));
		System.out.println(string.getBean("laptop", String.class));
		System.out.println(string.getBean("schoolName", String.class));
		System.out.println(string.getBean("mobile", String.class));

	}

}

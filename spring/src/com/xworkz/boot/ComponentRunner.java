package com.xworkz.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfigure;
import com.xworkz.configure.StringConfigure;
import com.xworkz.thing.Bank;
import com.xworkz.thing.Car;
import com.xworkz.thing.Hotel;
import com.xworkz.thing.Mobile;
import com.xworkz.thing.Rocket;
import com.xworkz.thing.Shoe;
import com.xworkz.thing.Television;
import com.xworkz.thing.laptop;

public class ComponentRunner {

	public static void main(String[] args) {
		ApplicationContext component = new AnnotationConfigApplicationContext(SpringConfigure.class);
		
		System.out.println("No of bean :" + component.getBeanDefinitionCount());
		System.out.println("--Beans Names are----");
		Stream.of(component.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		System.out.println("----------Running Rocket Component Class------------");
		System.out.println(component.getBean(Rocket.class));
		Rocket ref = component.getBean(Rocket.class);
		System.out.println(ref);
		
		System.out.println(ref.rocketName());
		System.out.println("----------Running bank Component Class------------");
		Bank bank = component.getBean(Bank.class);
		System.out.println(bank);

		System.out.println(bank.bankName());
		
		System.out.println("----------Running laptop Component Class------------");
		laptop lap = component.getBean(laptop.class);
		System.out.println(lap);

		System.out.println(lap.price());
		
		System.out.println("----------Running Television Component Class------------");
		Television tv = component.getBean(Television.class);
		System.out.println(tv);

		System.out.println(tv.price());
		
		System.out.println("----------Running Shoe Component Class------------");
		Shoe shoe = component.getBean(Shoe.class);
		System.out.println(shoe);

		System.out.println(shoe.price());
		
		System.out.println("----------Running Hotel Component Class------------");
		Hotel h = component.getBean(Hotel.class);
		System.out.println(h);

		System.out.println(h.name());
		
		System.out.println("----------Running car Component Class------------");
		Car c = component.getBean(Car.class);
		System.out.println(c);

		System.out.println(c.brand());
		
		System.out.println("----------Running mobile Component Class------------");
		Mobile m = component.getBean(Mobile.class);
		System.out.println(m);

		System.out.println(m.modelName());
		
		

	}

}

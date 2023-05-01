package electricity.com.xworkz.saloon.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import electricity.com.xworkz.saloon.thing.Barber;
import electricity.com.xworkz.saloon.thing.Saloon;
import electricity.com.xworkz.saloon.thing.Trimmer;
import electricity.com.xworkz.spring.configure.SpringConfigure;


public class SaloonRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigure.class);

		int beanDefinitionCount = spring.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		System.out.println(spring.getBean(Saloon.class));
		System.out.println(spring.getBean(Barber.class));
		System.out.println(spring.getBean(Trimmer.class));

	}

}

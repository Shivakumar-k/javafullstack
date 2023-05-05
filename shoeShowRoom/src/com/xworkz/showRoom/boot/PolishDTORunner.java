package com.xworkz.showRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showRoom.configure.PolishConfigure;
import com.xworkz.showRoom.dto.PolishDTO;
import com.xworkz.showRoom.dto.SalesManagerDTO;
import com.xworkz.showRoom.dto.SocksDTO;
import com.xworkz.showRoom.service.PolishService;
import com.xworkz.showRoom.service.PolishServiceImpl;
import com.xworkz.showRoom.service.SalesManagerService;
import com.xworkz.showRoom.service.SalesManagerServiceImpl;
import com.xworkz.showRoom.service.SocksService;
import com.xworkz.showRoom.service.SocksServiceImpl;

public class PolishDTORunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(PolishConfigure.class);

		System.out.println("-------------------Polish------------------");
		PolishService ref = spring.getBean(PolishService.class);
		PolishDTO dto = new PolishDTO("Kiwi", "Spray", 150.0d, 250);
		System.out.println(dto);
		boolean save = ref.validateAndSave(dto);
		System.out.println("saved: " + save);

		System.out.println("-------------------SalesManager------------------");
		SalesManagerService ref1 = spring.getBean(SalesManagerService.class); 
		SalesManagerDTO dto1 = new SalesManagerDTO("Jagan", 36, 45000.0d, 9638527412l); 
		System.out.println(dto1);
		boolean save1 = ref1.validateAndSave(dto1); 
		System.out.println("saved: " + save1);
		
		System.out.println("-------------------SocksService------------------");
		SocksService ref2 = spring.getBean(SocksService.class); 
		SocksDTO dto2 = new SocksDTO("Nike", "White", 8, 1000.0d); 
		System.out.println(dto2);
		boolean save3 = ref2.validateAndSave(dto2); 
		System.out.println("saved: " + save3);

	}

}

package com.xworkz.showRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showRoom.configure.PolishConfigure;
import com.xworkz.showRoom.dto.PolishDTO;
import com.xworkz.showRoom.dto.SalesManagerDTO;
import com.xworkz.showRoom.dto.SocksDTO;
import com.xworkz.showRoom.service.PolishServiceImpl;
import com.xworkz.showRoom.service.SalesManagerServiceImpl;
import com.xworkz.showRoom.service.SocksServiceImpl;

public class PolishDTORunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(PolishConfigure.class);

		PolishServiceImpl ref = spring.getBean(PolishServiceImpl.class);

		PolishDTO dto = new PolishDTO("Kiwi", "Spray", 150.0d, 250);
//		System.out.println(dto);

		boolean save = ref.validateAndSave(dto);
		System.out.println("saved: " + save);

		SalesManagerServiceImpl ref1 = spring.getBean(SalesManagerServiceImpl.class);
		SalesManagerDTO dto1 = new SalesManagerDTO("Jagan", 36, 45000.0d, 9638527412l);

		boolean save1 = ref1.validateAndSave(dto1);
		System.out.println("saved: " + save1);

		SocksServiceImpl ref2 = spring.getBean(SocksServiceImpl.class);
		SocksDTO dto2 = new SocksDTO("Nike", "White", 8, 1000.0d);

		boolean save3 = ref2.validateAndSave(dto2);
		System.out.println("saved: " + save3);

	}

}

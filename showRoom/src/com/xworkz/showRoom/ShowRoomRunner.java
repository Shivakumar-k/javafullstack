package com.xworkz.showRoom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowRoomRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeConfigure.class);

		ShowRoomServiceImpl ref = spring.getBean(ShowRoomServiceImpl.class);
		ShoeShowRoomDTO dto = new ShoeShowRoomDTO(2, "Bata", "Rajajinagar", "GSTIN123");
//		System.out.println(dto);
		boolean save = ref.validateAndSave(dto);
		System.out.println(save);

	}

}

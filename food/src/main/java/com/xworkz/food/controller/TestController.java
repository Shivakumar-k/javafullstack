package com.xworkz.food.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class TestController {
	
	public TestController() {
		System.out.println("Running TestController...");
	}
	@RequestMapping("/click")
	private String onClick() {
		System.out.println("running onClick in test controller");
		
		return "/index.jsp";
	}

}

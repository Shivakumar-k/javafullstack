package com.xworkz.google.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	
	public TestController() {
		System.out.println("Running TestController");
	}
	
	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Runnin on click");
		return "/google.jsp";
		

	}

}

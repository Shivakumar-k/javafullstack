package com.xworkz.info.controller;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	
	public TestController() {
		System.out.println("Running TestController...");
	}
@RequestMapping("/click")
	public String onClick() {
		System.out.println("Displaying details..");
		
		return "/display.jsp";
	}
}

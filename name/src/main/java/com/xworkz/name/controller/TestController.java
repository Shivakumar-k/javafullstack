package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {

	public TestController() {
		System.out.println("Running TestController");
	}

	@RequestMapping("/click")
	private String onClick() {
		System.out.println("click to display name");
		return "/display.jsp";

	}
}

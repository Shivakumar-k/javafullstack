package com.xworkz.newsLetter.controller;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class NewsLetterController {
	
	public NewsLetterController() {
		System.out.println("running NewsLetterController no arg const");
	}
	
	@RequestMapping("/sub")
	public String onSub() {
		System.out.println("running onSub method in NewsLetterController");
		return "/detailsPage.jsp";
	}

}

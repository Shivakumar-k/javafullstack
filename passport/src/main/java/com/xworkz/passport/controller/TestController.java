package com.xworkz.passport.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.passport.dto.PassportDTO;

@Component
@RequestMapping("/")
public class TestController {

	public TestController() {
		System.out.println("running TestController");
	}

	@RequestMapping("/send")
	public String onClick(PassportDTO dto, HttpServletRequest req,Model m) {
		System.out.println("Running onClick Method");
		System.out.println("Entered values:" + dto);
		req.setAttribute("name", req.getParameter("fname"));
		m.addAttribute("msg", "Registered successfully "+dto.getFname());

		return "Landing.jsp";

	}

}

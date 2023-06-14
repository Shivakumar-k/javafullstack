package com.xworkz.mall.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mall.dto.MallDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class DefaultController {
	
	public DefaultController() {
		log.info("No arg DefaultController const");
	}
	@RequestMapping("/start")
	String onStart(Model model) {
		log.info("Running  onStart in  Default Controller");
		model.addAttribute("dto", new MallDTO());		
		return "/Welcome.jsp";
		}

}

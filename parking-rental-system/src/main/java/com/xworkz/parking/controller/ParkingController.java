package com.xworkz.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.service.ParkingService;
@Controller
@Component
@RequestMapping
public class ParkingController {
	@Autowired
	private ParkingService service;
	
	public ParkingController() {
		System.out.println("Running no-arg const.. of ParkingController");
	}
	
	@GetMapping("/admin")
	public String onSearch( ParkingDTO dto,Model model) { 
		System.out.println("running onSearch");
		
//	Morning--	List<ParkingDTO> dtol = service.findAll();
		
		
		boolean valid =service.validate(dto);
		
		if(valid) {
			System.out.println("Valid credentials");
			return "/update.jsp";
		}				
		model.addAttribute("error","Invalid Email and Password");
		return "/Admin.jsp";

	}
	
	
	
	

}

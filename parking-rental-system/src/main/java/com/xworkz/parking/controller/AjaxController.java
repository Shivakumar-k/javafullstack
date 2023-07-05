package com.xworkz.parking.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;


import com.xworkz.parking.service.ParkingInfoService;
import com.xworkz.parking.service.UserInfoService;

public class AjaxController {
	
	private UserInfoService service;
	
	private ParkingInfoService infoService;
	
	public String validateFields(@PathVariable String location,@PathVariable String vehicleType,@PathVariable String vehicleBrand, @PathVariable String vehicleFuelType, @PathVariable String rentalTerms, Model model) {	
		System.out.println("Running validateFields method in AjaxController");
		
		return location;
		
	}

}

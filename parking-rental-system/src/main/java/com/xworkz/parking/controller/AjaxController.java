package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.service.ParkingInfoService;
import com.xworkz.parking.service.UserInfoService;
@RestController

public class AjaxController {
   @Autowired
	private UserInfoService service;
   @Autowired
	private ParkingInfoService infoService;

	public String validateFields(@PathVariable String location, @PathVariable String vehicleType,
			@PathVariable String vehicleBrand, @PathVariable String vehicleFuelType, @PathVariable String rentalTerms,
			Model model) {
		System.out.println("Running validateFields method in AjaxController");
		ParkingInfoDTO dto = this.infoService.isExist(location, vehicleType, vehicleBrand, vehicleFuelType,
				rentalTerms);
		System.out.println(dto);
		if (dto != null) {
			return "Data is already exist";
		}
		return " ";
	}

	@GetMapping(value = "/validateEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String validateEmail(@PathVariable String email) {
		System.out.println("Running validate email");
		boolean exist = service.isUserExist(email);
		if (exist) {
			return "Email is already registered,please login";
		}
		return " ";
	}

	@GetMapping(value = "/getPriceAndDiscount/{location}/{type}/{classification}/{days}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ParkingInfoDTO getPriceAndDiscount(@PathVariable String location,@PathVariable String vehicleType,@PathVariable String vehicleBrand, @PathVariable String vehicleFuelType, @PathVariable String rentalTerms, Model model) {
		System.out.println("Ajax Controller: getPriceAndDiscount()");
		System.out.println("location:" +location);
		System.out.println("type:" +vehicleType);
		System.out.println("vehicleBrand:" +vehicleBrand);
		System.out.println("vehicleFuelType:" +vehicleFuelType);
		System.out.println("days:" +rentalTerms);
		System.out.println("Running getPriceAndDiscount method in ParkingAjaxController");
		ParkingInfoDTO dto = this.infoService.isExist(location, vehicleType, vehicleBrand, vehicleFuelType, rentalTerms);
		System.out.println(dto);
		if (dto != null) {
			return dto;
		}
		return null;
	}

}

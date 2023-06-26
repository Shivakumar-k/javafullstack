package com.xworkz.parking.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.service.ParkingInfoService;
import com.xworkz.parking.service.ParkingService;

@Controller
@Component
@RequestMapping("/")
public class ParkingController {
	@Autowired
	private ParkingService service;
	@Autowired
	private ParkingInfoService infoService;

	public ParkingController() {
		System.out.println("Running no-arg const.. of ParkingController");
	}

	@GetMapping("/admin")
	public String onSearch(ParkingDTO dto, Model model) {
		System.err.println("running onSearch");
		boolean valid = this.service.validate(dto);

		if (valid) {
			System.out.println("Valid credentials");
			return "/update.jsp";
		} else {
			model.addAttribute("error", "Invalid Email and Password");
			return "/Admin.jsp";
		}
	}
    @PostMapping("/info")
	public String parkingInfo(ParkingInfoDTO infoDto, Model model) {
		System.out.println("Running ParkingInfo " + getClass().getSimpleName());
		boolean save = infoService.validateAndSave(infoDto);
		if (save) {
			model.addAttribute("success", "data savesd successfully");
			return "/ParkingDetails.jsp";
		} else {
			model.addAttribute("error", "data not saved");
			return "/ParkingInfo.jsp";
		}
	}
}

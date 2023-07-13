package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.UserSignUpDTO;
import com.xworkz.parking.service.UserSignUpService;
@Controller
@RequestMapping("/")
public class UserSignUpController {
	@Autowired
	private UserSignUpService service;
	
	public UserSignUpController() {
		System.out.println("No-arg const....");
	}
	
	@PostMapping("/SignUp")
	private String userSignUp(UserSignUpDTO dto, Model model) {
		System.out.println("Running userSignUp method in UserSignUpController");
		boolean save = this.service.save(dto);
		if (save) {
			model.addAttribute("success", "SignUp Successfully,Please Enter Otp");
			return "/UserSignIn.jsp";
		} else {
			model.addAttribute("failure", "SignUp Failed");
			return "/UserSignUp.jsp";
		}
	}
	
	@PostMapping("/verifyOtp")
	private String verifyOTP(String otp, UserSignUpDTO dto, Model model) {
		System.out.println("Running userSignUp method in UserSignUpController");
		dto.setOtp(otp);
		boolean result = this.service.verifyOtp(dto);
		if (result) {
			model.addAttribute("verifiedSuccessfully", "OTP verified Successfully Now you can login ");
			return "/UserSignIn.jsp";
		} else {
			model.addAttribute("verificationFailure", "OTP verified failed");
			return "/UserSignUp.jsp";
		}

	}
	@PostMapping("/SignIn")
	private String signIn(String email) {
		System.out.println("Running signIn method");
	boolean save	=this.service.sendOtp(email);
	if(save) {
		return "/Otp.jsp";
	}
		return "/UserSignIn.jsp";	
	}

}

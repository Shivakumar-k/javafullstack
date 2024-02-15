package com.xworkz.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.service.FormService;
@Controller
@Component
@RequestMapping("/")
public class FormController {
	@Autowired
	private FormService service;
	
	public FormController() {
		System.out.println("Running FormController ...");
	}

	@PostMapping("/save")
	private String onSave(FormDTO dto, Model model) {
		System.out.println("Running onSave in  FormController ...");
		Boolean save = this.service.validateAndSave(dto);
		
		if (save){
			System.out.println("saved...");
			model.addAttribute("success", "data saved successfully");
			return "/display.jsp";
		}else {
			System.out.println("Not saved...");
			model.addAttribute("error","data not saved");
			return "/index.jsp";
		}
		
	}

}

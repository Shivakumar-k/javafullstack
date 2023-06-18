package com.xworkz.contact.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.service.ContactService;
@Controller
@Component
@RequestMapping("/")
public class ContactController {
	
	

	public ContactController() {
		System.out.println("running no arg const of ContactController");
	}
	
	@Autowired
	private ContactService service;
	
	@GetMapping("/search")
	public String onSearch(Model model, String name) {
		System.out.println("running onSearch with param"+name);
		List<ContactDTO> list= service.findByName(name);
		model.addAttribute("list",list);
		return "/Search.jsp";

	}

	@PostMapping("/save")
	public String onSave(Model model,ContactDTO dto, BindingResult bindingResult, MultipartFile file) throws IOException {
		System.out.println("Running onSave method");
//		model.addAttribute("dtos", dto);
//		System.out.println("DTOs: " + dto);

		if (bindingResult.hasErrors()) {
			System.out.println("data is invalid");
			model.addAttribute("errMsg", bindingResult.getAllErrors());
			bindingResult.getAllErrors().forEach(e -> System.out.println(e.getDefaultMessage()));
			model.addAttribute("dtos", dto);
			return "/Register.jsp";
		} else {
			
			
			System.out.println("File Name: "+ file.getName());
			System.out.println("File Original Name: "+file.getOriginalFilename());
			System.out.println("content Type  "+file.getContentType());
			System.out.println("file size: "+file.getSize());
//	System.out.println(file.getBytes());
			String dtoFileName =System.currentTimeMillis()+"_"+file.getOriginalFilename();
			dto.setFileName(dtoFileName);
			dto.setOriginalFileName(file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			File physicalFile = new File(dto.getFileName());
//			m.addAttribute("fileName", file.getOriginalFilename());
			try(OutputStream os = new FileOutputStream(physicalFile)){			
				os.write(file.getBytes());
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Data is valid: "+dto);
			service.validateAndSave(dto);
			model.addAttribute("successmsg", "Data saved succesfully");
			
			return "/Register.jsp";
		}
		
	}
	
	

}

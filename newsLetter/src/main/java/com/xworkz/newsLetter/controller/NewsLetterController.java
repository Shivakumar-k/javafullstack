package com.xworkz.newsLetter.controller;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.newsLetter.dto.NewsLetterDTO;

@Controller
@Component
@RequestMapping("/")
public class NewsLetterController {

	public NewsLetterController() {
		System.out.println("running NewsLetterController no arg const");
	}

	@PostMapping("/sub")
	public String onSub(NewsLetterDTO dto, Model model, MultipartFile file) throws IOException {
		System.out.println("running onSub method in NewsLetterController");
		System.out.println("dto: " + dto);
		model.addAttribute("name", "registerd successfully" + dto.getName());
		System.out.println("file name: " + file.getName());
		System.out.println("file size: " + file.getSize());
		System.out.println("file content type: " + file.getContentType());
		System.out.println("file Bytes " + file.getBytes());

		return "/detailsPage.jsp";
	}

}

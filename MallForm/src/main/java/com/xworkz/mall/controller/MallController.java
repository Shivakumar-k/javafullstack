package com.xworkz.mall.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.mall.dto.MallDTO;
import com.xworkz.mall.service.MallService;

import lombok.extern.slf4j.Slf4j;

import com.xworkz.mall.constant.MallConstant;

@Component
@RequestMapping
@Slf4j
public class MallController {
	
	private Collection<MallDTO> mallDtos = new ArrayList<>();
	@Autowired
	private MallService service;
	
	public MallController() {
		log.info("Running MallController no-arg const..");
	}
	@PostMapping("/send")
	public String onSubmit(Model m, @Valid MallDTO dto, BindingResult b,MultipartFile file) throws IOException{
		if (b.hasErrors()) {
			m.addAttribute("errors", b.getFieldErrors());
			List<FieldError> errors = b.getFieldErrors();
		    for (FieldError error : errors) {
		        log.info("Error in field: " + error.getField());
		        log.info("Error message: " + error.getDefaultMessage());
		    }
		    m.addAttribute("dto",dto);
			return "Welcome.jsp";
		}
		else {
			
		
		log.info("Running onSubmit method: "+dto);
		
		
		for (MallDTO mallDTO : mallDtos) {
		log.info("Saved Successfully: "+mallDTO);	
		}
		log.info("File recieved: "+file.getName());
		log.info("File Size "+file.getSize());
		log.info("File Type "+file.getContentType());
		log.info("File bytes "+file.getBytes());
		
		dto.setContentType(file.getContentType());
		dto.setFileSize(file.getSize());
		String dtoFileNAme=System.currentTimeMillis()+"_"+file.getOriginalFilename();
		dto.setFileName(MallConstant.FILE_NAME+dtoFileNAme);
		dto.setOriginalFileName(dtoFileNAme);
		
		File physicalFile = new File(dto.getFileName());
//		m.addAttribute("fileName", file.getOriginalFilename());
		try(OutputStream os = new FileOutputStream(physicalFile)){			
			os.write(file.getBytes());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		log.info("Data is Valid"+dto);
		service.validateAndSave(dto);
		
		this.mallDtos.add(dto);
		log.info("Added the DTO into list");
		m.addAttribute("Total", this.mallDtos.size());
		
		m.addAttribute("msg","Thank you for visiting "+dto.getName());
		return "Welcome.jsp";
		}
	}
	@GetMapping("/downloadFile")
	private void sendFile(String  fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("Running sendFile method in controller");
		File file = new File(MallConstant.FILE_NAME + fileName);
		response.setContentType(contentType);
		OutputStream outputStream = response.getOutputStream();

		FileInputStream inputStream = new FileInputStream(file);
		byte[] bs = new byte[4096];
		int length;

		while ((length = inputStream.read(bs)) > 0) {
			outputStream.write(bs, 0, length);
		}
		inputStream.close();
		outputStream.flush();
	}
	@RequestMapping("/view")
	public String onView(Model model,MultipartFile file) {
		
		model.addAttribute("list", this.mallDtos);
		return "view.jsp";
	}
}

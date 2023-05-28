package com.xworkz.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.edu.dto.DetailsDTO;
import com.xworkz.edu.service.DetailsService;
import com.xworkz.edu.service.DetailsServiceImpl;
@WebServlet(loadOnStartup = 1,urlPatterns = ("/send"))
public class DetailsServelet extends HttpServlet {
	
	
	DetailsService detailsService = new DetailsServiceImpl();
		
	
	public DetailsServelet() {
		System.out.println("no-arg const of DetailsServelet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running dopost method");
		
		String name = req.getParameter("name");
		
		DetailsDTO detailsDto = new DetailsDTO();
		
		detailsDto.setName(req.getParameter("name"));
		detailsDto.setQualification(req.getParameter("Qualification"));
		detailsDto.setStream(req.getParameter("stream"));
		detailsDto.setUniversity(req.getParameter("Uni"));
		detailsDto.setCollage(req.getParameter("college"));
		detailsDto.setCity(req.getParameter("city"));
		detailsDto.setState(req.getParameter("state"));
		detailsDto.setCountry(req.getParameter("country"));
		
		System.out.println(detailsDto.toString());
		
		try {
			boolean save1=this.detailsService.validateAndSave(detailsDto);
			System.out.println(save1);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		


		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
	
		requestDispatcher.forward(req, resp);

	}
	
	
}



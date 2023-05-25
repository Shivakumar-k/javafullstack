package com.xworkz.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Details")
public class DetailsServlet extends HttpServlet {

	public DetailsServlet() {
		System.out.println("no-arg const........of details");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method");
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running dopost method");
		
		System.out.println(req.getRequestURI());

//		String firstName = req.getParameter("Name");
		
//		String country = req.getParameter("Country");



		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Index.jsp");
	
		requestDispatcher.forward(req, resp);
//		
//		System.out.println("Name: "+firstName);
//		System.out.println("Country: "+lastName);
	}

}

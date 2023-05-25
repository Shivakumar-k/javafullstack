package com.xworkz.shiva;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Country")
public class ShivaServlet extends HttpServlet {

	public ShivaServlet() {
		System.out.println("No arg const.......");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running srvice");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Do get method ");

		System.out.println(req.getRequestURI());

		Enumeration<String> e = req.getHeaderNames();
		while (e.hasMoreElements()) {
			String headerName = e.nextElement();
			System.out.println(headerName + " " + req.getHeader(headerName));

		}

		System.out.println("==============================");

		String ref = req.getParameter("CountryName");
		String ref1 = req.getParameter("CountryCode");
		String ref2 = req.getParameter("CountryCapital");
		String ref3 = req.getParameter("CountryPopulation");

		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.print("This is info ");
		printWriter.println(ref + " " + ref1 + " " + ref2 + " " + ref3 + " " + "info sucess");

		
		printWriter.print("</h1>");
		printWriter.print("<form method='get' action='pmName'>");
		printWriter.print("<h4>Enter PM Name:<input type='type' name='pm' required></h4>");

		printWriter.print("<input type='submit' value='Next'>");
		printWriter.print("</form>");
		printWriter.print("</body>");
		printWriter.print("</html>");

	}

}

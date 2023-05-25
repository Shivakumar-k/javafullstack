package com.xworkz.shiva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/pmName")
public class PMServlet extends HttpServlet {

	public PMServlet() {
		System.out.println("no-arg cons............");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.err.println("Runnimg service in PmServlet");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do-get method");

		System.out.println(req.getRequestURI());

		String pmName = req.getParameter("pm");
		
		PrintWriter printWriter = resp.getWriter();
		System.out.println("PM Name : " + pmName);

		printWriter.print("<head>");

		printWriter.print("<title>");
		printWriter.print("PM Detail Page");
		printWriter.print("</title>");
//		printWriter.print("</title>");

		printWriter.print("</head>");

		printWriter.print("<body>");

		printWriter.print("<h1>");
		printWriter.print("PM Info");
		printWriter.print("</h1>");

		printWriter.print("<h3>");
		printWriter.print("PM Name:" + pmName);
		printWriter.print("</h3>");

		printWriter.print("<ul>");
		printWriter.print("<li>");
		printWriter.print("<a href='index.html'>Go to index");
		printWriter.print("</li>");
		printWriter.print("</ul>");

		printWriter.print("</body>");
		printWriter.print("</html>");

	}

}

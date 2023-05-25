package com.xworkz.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class FavoritesServlet extends HttpServlet {

	public FavoritesServlet() {
		System.out.println("no-arg const..........favs");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post of favs");

		req.setAttribute("food", req.getParameter("food"));
		req.setAttribute("Place", req.getParameter("place"));
		req.setAttribute("Person", req.getParameter(("person")));

		String lap[] = { "hp", "dell", "mac" };

		req.setAttribute("laptop1", lap[0]);
		req.setAttribute("laptop2", lap[1]);
		req.setAttribute("laptop3", lap[2]);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("FavDisplay.jsp");
		requestDispatcher.forward(req, resp);

	}

}

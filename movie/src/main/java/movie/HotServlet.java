package movie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/Send")
public class HotServlet extends HttpServlet {
	
	public HotServlet() {
		System.out.println("HotServlet using  No-arg const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service");
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get method in hotServlet");
		
		System.out.println(req.getRequestURI());
		
		Enumeration<String> e = req.getHeaderNames();
		
		while (e.hasMoreElements()) {
			String headerName = (String) e.nextElement();
			System.out.println(headerName+" : "+req.getHeader(headerName));
			
			
		}
		System.out.println("======================");
		resp.setContentType("text/html");
		
	  PrintWriter writer = resp.getWriter();
	  writer.print("<html><Body><h1>This is my first response...</h1></Body></html>");
	  
		
		
	}
	
	

}

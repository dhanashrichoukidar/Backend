

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-emp-dtl")
public class SaveEmployee extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		String title = request.getParameter("title");
		String year = request.getParameter("year");
		String percent = request.getParameter("percent");
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Contact : " + contact);
		System.out.println("title : " + title);
		System.out.println("year : " + year);
		System.out.println("percent : " + percent);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Inside Save Details Page</h1>");
				
	}

}
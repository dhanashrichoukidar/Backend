


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchQuery = request.getParameter("query");
		
		// Create Cookie
		Cookie ck = new Cookie("search", searchQuery);
		// set the expire date from the cookie which must be in Seconds
		ck.setMaxAge(48*60*60);
		// Set Cookie into response
		response.addCookie(ck);
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Your Search for : "+searchQuery+"</h1>");
	}

}
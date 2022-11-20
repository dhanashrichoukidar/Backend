

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1 style='color:Green'>Welcome User : "+userName+"</h1>");
		out.print("</div>");
		
	}

}


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user-details")
public class UserDetails extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		out.print("<form action='display-details' method='GET'>");
			out.print("Enter First Name : <input type='text' name='fname'>");
			out.print("<br/><br/>");
			out.print("Enter Middle Name : <input type='text' name='mname'>");
			out.print("<br/><br/>");
			out.print("Enter Last Name : <input type='text' name='lname'>");
			out.print("<br/><br/>");
			out.print("<input type='submit' value='Send'>");
		out.print("</form>");
		out.print("</div>");
	}

}
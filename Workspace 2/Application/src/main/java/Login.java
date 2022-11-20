

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign-in")
public class Login extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		out.print("<h1>User Sign-In Page</h1>");
		out.print("<form action='validate' method='POST'>");
			
			out.print("Enter User Email : <input type='text' name='email'>");
			out.print("<br/><br/>");
			out.print("Enter Password : <input type='password' name='password'>");
			out.print("<br/><br/>");
			out.print("<button type='submit'>Login</button>");
			out.print("<h1> <a href = 'sign-up'> Not Registered?</a> </h1>");
			
		out.print("</form>");
		out.print("</div>");
	
		
	}

}

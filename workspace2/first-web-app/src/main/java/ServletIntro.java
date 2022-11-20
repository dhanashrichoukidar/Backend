

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet-intro")
public class ServletIntro extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  // MIME type
		PrintWriter out = response.getWriter();
		out.print("Hello ,This is my First test Response..");
		out.print("<h1>Hello, This is my First HTML response</h1>");
	}

}
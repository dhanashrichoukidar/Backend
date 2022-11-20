

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-details")
public class DisplayDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fn = request.getParameter("fname");
		String mn = request.getParameter("mname");
		String ln = request.getParameter("lname");
		String fullName = fn + " " + mn + " " + ln;
		
		// Insert the Data into DB
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDetails", "root", "Inception@03");
			PreparedStatement stmt = con.prepareStatement("insert into User values (?,?,?,?)");
			stmt.setString(1, fn);
			stmt.setString(2, mn);
			stmt.setString(3, ln);
			stmt.setString(4, fullName);
			
			int count = stmt.executeUpdate();
			stmt.close();
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		out.print("<div align='center'>");
			out.print("<h1>Display Details Page</h1>");
			out.print("<h2>Full Name : "+fullName+"</h2>");
		out.print("</div>");
	}

}
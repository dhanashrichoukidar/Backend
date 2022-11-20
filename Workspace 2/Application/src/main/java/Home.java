

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("email");
		String userPassword = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
			
			PreparedStatement stmtCheck = con.prepareStatement(" select * from data where email=? and password=?");
			stmtCheck.setString(1,userName);
			stmtCheck.setString(2,userPassword);
			ResultSet rs = stmtCheck.executeQuery();
			if(rs.next()) {

		out.print("<div align='center'>");
			out.print("<h1 style='color:Green'>Welcome User : "+ rs.getString("name")+"</h1>");
		out.print("</div>");
		
	}

}catch(Exception e) {
	e.printStackTrace();}
}
}
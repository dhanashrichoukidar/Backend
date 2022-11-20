

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String userName = request.getParameter("email");
			String userPassword = request.getParameter("password");
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
				
				PreparedStatement stmtCheck = con.prepareStatement(" select * from data where email=? and password=?");
				stmtCheck.setString(1,userName);
				stmtCheck.setString(2,userPassword);
				ResultSet rs = stmtCheck.executeQuery();
				if(rs.next()) {
					RequestDispatcher dis = request.getRequestDispatcher("home");
					dis.forward(request, response);
				}else {
					response.sendRedirect("error");
				}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
	}

}

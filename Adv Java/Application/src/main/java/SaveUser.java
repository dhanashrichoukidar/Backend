

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/save-user")
public class SaveUser extends HttpServlet {
	int id;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String un = request.getParameter("name");
		String ue = request.getParameter("email");
		String uc = request.getParameter("contact");
		String up = request.getParameter("password");
		String message= "Inquery Creation Failed...";
		// Insert the Data into DB
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
			
			PreparedStatement stmtCheck = con.prepareStatement(" select * from data where email=?");
			stmtCheck.setString(1, ue);
			ResultSet rs = stmtCheck.executeQuery();
			if(rs.next()) {
				message = "Inquery with this Email Id is already available.... Please use another Email Id";
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<h1>"+message+"</h1>");
				out.print("<h1> <a href = 'sign- up'> Register Again</a> </h1>");
				out.close();
			
			}else {	
			PreparedStatement stmt = con.prepareStatement("insert into data values (?,?,?,?,?)");
			
			stmt.setInt(1, id++);
			stmt.setString(2, un);
			stmt.setString(3, ue);
			stmt.setString(4, uc);
			stmt.setString(5, up);
			
			int count = stmt.executeUpdate();
			if(count>0) {
				message = "Inquery Created Successfully...";
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<h1>"+message+"</h1>");
				out.print("<h1> <a href = 'sign- in'> Go to Login</a> </h1>");
				out.close();
				
			}
			stmt.close();
			con.close();
		}
			}catch (Exception e){
			e.printStackTrace();
		}
		
	
	}


	}


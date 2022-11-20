

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

@WebServlet("/create-inquery")
public class SaveDetails extends HttpServlet {
	int id;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nm");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String message = "Inquery Creation Failed...";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july","root","Inception@03");
			
			
			PreparedStatement stmtCheck = con.prepareStatement(" select * from studinfo where email=?");
			stmtCheck.setString(1, email);
			ResultSet rs = stmtCheck.executeQuery();
			if(rs.next()) {
				message = "Inquery with this Email Id is already available.... Please use another Email Id";
			}
			else {
				PreparedStatement stmt = con.prepareStatement("insert into studInfo values(?,?,?,?,?)");
				stmt.setInt(1, id++);
				stmt.setString(2, name);
				stmt.setString(3, contact);
				stmt.setString(4, email);
				stmt.setString(5, city);
				
				int count = stmt.executeUpdate();
				
				if(count>0) {
					message = "Inquery Created Successfully...";
				}
			}
			con.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+message+"</h1>");
		out.close();
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmailCheck {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter email : ");
			String email = scan.next();
			System.out.println("Enter Password : ");
			String Password = scan.next();
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july", "root", "Inception@03");
			// 3. Create Statement
			PreparedStatement stmt = 
					con.prepareStatement("select * from EmployeeDetails where email=? and password=?"); // parameterized query
					stmt.setString(1, email);
					stmt.setString(2, Password);
					ResultSet r = stmt.executeQuery();
			if (r.next()) {
				System.out.println("Valid User");
			}
			else{
				System.out.println("Invalid Username or Password");
			}
			// 5. close connection
			stmt.close();
			con.close();
			scan.close();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Id : ");
			int id = scan.nextInt();
			System.out.println("Enter name : ");
			String name = scan.next();
			
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
					con.prepareStatement("insert into EmployeeDetails values(?,?,?,?)"); // parameterized query
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, Password);
			
			//4. Execute Query
			int count = stmt.executeUpdate();
			
			// 5. close connection
			stmt.close();
			con.close();
			scan.close();
			
			System.out.println(count + " : rows inserted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}














import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Id : ");
			int id = scan.nextInt();
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july", "root", "Inception@03");
			
			// 3. Create Statement
			PreparedStatement stmt = 
					con.prepareStatement("delete from studinfo where sid=?"); // parameterized query
			
			stmt.setInt(1, id);
			
			//4. Execute Query
			int count = stmt.executeUpdate();
			
			// 5. close connection
			stmt.close();
			con.close();
			
			System.out.println(count + " : rows deleted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
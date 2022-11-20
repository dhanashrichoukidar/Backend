
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Id : ");
			int id = scan.nextInt();
			System.out.println("Enter contact : ");
			String c = scan.next();
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july", "root", "Inception@03");
			
			// 3. Create Statement
			PreparedStatement stmt = 
					con.prepareStatement("update studinfo set contact=? where sid=?"); // parameterized query
			
			stmt.setString(1, c);
			stmt.setInt(2, id);
			
			//4. Execute Query
			int count = stmt.executeUpdate();
			
			// 5. close connection
			stmt.close();
			con.close();
			
			System.out.println(count + " : rows updated...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
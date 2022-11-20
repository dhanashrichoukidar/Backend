
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SelectData {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july", "root", "Inception@03");

			// Create Statement
			PreparedStatement stmt = con.prepareStatement("select * from studinfo");
			
			// Execute Statement 
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("sid") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("contact") + "\t");
				System.out.print(rs.getString("email") + "\n");
			}
			// 5. close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
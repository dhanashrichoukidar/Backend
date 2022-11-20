import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please select option : ");
			int option = scan.nextInt(); 
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july", "root", "Inception@03");
			// 3. Create Statement
			switch(option) {
			case 1:
				System.out.println("Register user");
				System.out.println("Enter Id : ");
				int id = scan.nextInt();
				System.out.println("Enter name : ");
				String name = scan.next();
				System.out.println("Enter email : ");
				String email = scan.next();
				System.out.println("Enter Password : ");
				String Password = scan.next();
			PreparedStatement stmt = 
					con.prepareStatement("insert into EmployeeDetails values(?,?,?,?)"); // parameterized query	
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, Password);
			//4. Execute Query
			int count = stmt.executeUpdate();
			System.out.println(count + " : rows inserted...");
			System.out.println("User Registered successfully");
			stmt.close();
			con.close();
			scan.close();
			break;
			
			
			case 2:
			System.out.println("Login If already registered");
			System.out.println("Enter email : ");
			String email1 = scan.next();
			System.out.println("Enter Password : ");
			String Password1 = scan.next();
			PreparedStatement stmt1 = 
				con.prepareStatement("select * from EmployeeDetails where email=? and password=?"); // parameterized query
				stmt1.setString(1, email1);
				stmt1.setString(2, Password1);
				ResultSet r = stmt1.executeQuery();
				if(r.next()) {
					System.out.println("Welcome " + r.getString("name"));
						}else {
							System.out.println("Invalid Username or Password");
						}
				stmt1.close();
				con.close();
				scan.close();
				break;
				
				
				
			case 3: 
				System.out.println("Change Password");
				System.out.println("Enter email : ");
				String email2 = scan.next();
				System.out.println("Enter old Password : ");
				String oldPassword = scan.next();
				System.out.println("Enter new Password : ");
				String newPassword = scan.next();
				PreparedStatement stmt2 = 
				con.prepareStatement("Update EmployeeDetails set password=? where email=? And Password=?"); // parameterized query
				stmt2.setString(1, newPassword);
				stmt2.setString(2, email2);
				stmt2.setString(3, oldPassword);
				int r1 = stmt2.executeUpdate();
				if(r1==1) {
					System.out.println("Password updated successfully");
						}else {
							System.out.println("Invalid Username or Password");
						}
				stmt2.close();
				con.close();
				scan.close();
				break;
				
				
				case 4: 
				System.exit(0);
				con.close();
				scan.close();
				break;
				
				
				default:
					System.out.println("Invalid Choice");
						}
			
			// 5. close connection
			con.close();
			scan.close();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

}




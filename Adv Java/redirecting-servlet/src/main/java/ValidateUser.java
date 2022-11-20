

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth-user")
public class ValidateUser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("upass");
		
		if("Admin".equals(userName) && "Admin123".equals(userPassword)) {
			
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);
			//dis.include(request, response);
		} else {

			response.sendRedirect("error");
			
		}
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class Authenticate extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		if("Admin".equals(user) && "admin123".equals(pass)) {
			HttpSession session = request.getSession(); // get the new or existing session
			session.setAttribute("name", user); // to set value inside session.
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("login.jsp?code=-1");
		}
	}

}
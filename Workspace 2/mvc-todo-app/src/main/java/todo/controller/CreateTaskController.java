package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.bean.TaskBean;
import todo.model.ToDoModel;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

@WebServlet("/create-my-task")
public class CreateTaskController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String status=request.getParameter("status");
		String sceduledOn = request.getParameter("scheduledOn");
		java.time.LocalDate.now();
	//	String updatedOn = request.getParameter("updatedOn");
		
		TaskBean bean = new TaskBean();
		bean.setTitle(title);
		bean.setStatus(status);
		bean.setScheduledOn(sceduledOn);
	//	bean.setUpdatedOn(updatedOn);
		
		
		ToDoModel model =new ToDoModel();
		boolean result = model.save(bean);
		String code = "500";
		if(result) {
			code = "200";
		}
		response.sendRedirect("create-task.jsp?code="+code);
		
		
		
	}

}

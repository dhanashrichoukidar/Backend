package todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.bean.TaskBean;
import todo.model.ToDoModel;
import java.time.*;


@WebServlet("/edit-task-controller")
public class EditTaskController extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			String title = request.getParameter("title");
			String status=request.getParameter("status");
			String sceduledOn = request.getParameter("scheduledOn");
		//	String updatedOn=request.getParameter("updatedOn");
			LocalDate updatedOn = java.time.LocalDate.now();


			
			TaskBean bean = new TaskBean();
			bean.setId(id);
			bean.setTitle(title);
			bean.setStatus(status);
			bean.setScheduledOn(sceduledOn);
		//	bean.setUpdatedOn(updatedOn);
			bean.setUpdatedOn(updatedOn.toString());
			
			
			ToDoModel model = new ToDoModel();
			boolean result = model.updateTask(bean);
			
			request.setAttribute("tasks", bean);
		String code = "500";
			if(result) {
				code = "200";
			}
		
		//	response.sendRedirect("edit-task.jsp?code="+code);
			RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp?code="+code);
			dis.forward(request, response);
			
	
		}
			
			
	}



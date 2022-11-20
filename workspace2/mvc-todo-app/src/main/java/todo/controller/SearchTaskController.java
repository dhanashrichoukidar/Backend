package todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.bean.TaskBean;
import todo.model.ToDoModel;

@WebServlet("/search-task")
public class SearchTaskController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status=request.getParameter("status");
		String scheduledOn = request.getParameter("scheduledOn");
		ToDoModel model = new ToDoModel();

		if( model.getByStatus(status) != null) {
				List<TaskBean> bean = model.getByStatus(status);
				System.out.println(bean.size());
			request.setAttribute("tasks", bean);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("view-task.jsp");
			dis.forward(request, response);
	
			}else if(scheduledOn != null) {
				List<TaskBean> bean = model.getByDate(scheduledOn);
				
				request.setAttribute("tasks", bean);
				RequestDispatcher dis = request.getRequestDispatcher("view-task.jsp");
				dis.forward(request, response);
		
		
	}

	}}

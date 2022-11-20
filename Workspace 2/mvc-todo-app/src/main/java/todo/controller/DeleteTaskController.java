package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.bean.TaskBean;
import todo.model.ToDoModel;

@WebServlet("/delete-task")
public class DeleteTaskController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
		
		ToDoModel model = new ToDoModel();
		boolean bean = model.deleteTask(id);
		
		request.setAttribute("task", bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("show-my-task");
		dis.forward(request, response);
		
	}
	}


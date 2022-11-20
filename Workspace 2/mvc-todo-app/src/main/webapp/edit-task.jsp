<%@page import="todo.bean.TaskBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Task</title>
</head>
<body>
<%@ include file="navbar.jsp" %>

<%
String code = request.getParameter("code");
String msg = "";
String color = "";
if(code!=null){
	switch(code){
	case "500":
		msg = "Task Edition Failed";
		color = "red";
		break;
	case "200" :
		msg = "Task Edited Suceessfully...!!";
		color = "green";
		break;
	}
}



%>

<h3 style = "color: <%= color%>"> <%= msg %></h3>
	
	<div align="center">
		<h2>Edit Task</h2>
		
			<% TaskBean bean = (TaskBean) request.getAttribute("tasks"); %>
		
	
		
		<form action="edit-task-controller">
			<input type="hidden" name="id" value="<%=bean.getId()%>">
			
			Enter Title : <input name="title" value="<%=bean.getTitle()%>">
			<br><br>
			Select Status : <select name="status">
								<option value="open">Open</option>
								<option value="in-progress">In-Progress</option>
								<option value="completed">Completed</option>
							</select>
			<br><br>
			Enter ScheduledOn Date : <input type="date" name="scheduledOn" value="<%= bean.getScheduledOn() %>">
			<br><br>
			<button type="submit">Update Task</button>
		</form>
	</div>
</body>
</html>
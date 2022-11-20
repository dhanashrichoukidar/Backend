<%@page import="java.util.ArrayList"%>
<%@page import="todo.bean.TaskBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View My Task</title>
</head>
<body>
	<%@ include file="navbar.jsp" %>
	
	<%
		ArrayList<TaskBean> taskList = (ArrayList<TaskBean>) request.getAttribute("tasks");	
	%>
	
	<table border="2">
		<thead>
			<tr>
				<th>Title</th>
				<th>Status</th>
				<th>Scheduled Date</th>
				<th>Updated Date</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
		
		
		<%
		if(taskList!= null){
		for(TaskBean bean : taskList) { %>
			<tr>
				<td><%= bean.getTitle() %> </td>
				<td><%= bean.getStatus() %> </td>
				<td><%= bean.getScheduledOn() %> </td>
				<td><%= bean.getUpdatedOn() %> </td>
				<td>
					<a href="update-task?id=<%= bean.getId()%>">Edit</a> /
					<a href="delete-task?id=<%= bean.getId()%>">Delete</a>
				 </td>
			</tr>
		<% }} %>
		</tbody>
	
	</table>
	
	

</body>
</html>
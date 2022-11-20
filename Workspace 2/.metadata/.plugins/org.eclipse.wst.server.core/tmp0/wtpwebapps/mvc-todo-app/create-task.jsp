<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Task</title>
</head>
<body>

	<%@ include file="navbar.jsp" %>
	
	<div align="center">
		<h2>Create New Task</h2>
		
		<%
	String code = request.getParameter("code");
	String msg = "";
	String color = "";
	if(code != null) {
		switch(code) {
			case "500" :
				msg = "Task Creation Failed...";
				color = "red";
				break;
			case "200" :
				msg = "Task Created successfully..!!";
				color = "green";
				break;
		}
	}

%>	
		<h3 style="color:<%=color%>"><%= msg %></h3>
		
		<form action="create-my-task">
			Enter Title : <input name="title">
			<br><br>
			Select Status : <select name="status">
								<option value="open">Open</option>
								<option value="in-progress">In-Progress</option>
								<option value="completed">Completed</option>
							</select>
			<br><br>
			Enter Scheduled Date : <input type="date" name="scheduledOn">
			<br><br>
			<button type="submit">Create Task</button>
		</form>
	</div>

</body>
</html>
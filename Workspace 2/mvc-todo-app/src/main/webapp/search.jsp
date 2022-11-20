<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Task here</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div align="center">
<h3>Search Task</h3>

<form action="search-task">

Enter Scheduled Date: <input type="Date" name="scheduledOn">
<br><br>
Select Status : <select name="status">
				<option value="open">Open</option>
				<option value="in-progress">In-Progress</option>
				<option value="completed">Completed</option>
				</select>
<br><br>

<button type="submit">Search</button>
</form>
</div>


</body>
</html>
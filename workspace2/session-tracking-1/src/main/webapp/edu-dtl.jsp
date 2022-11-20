<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Education Details</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
%>

	<div align="center">
		<h1>Step 2 of 3</h1>
		<hr>
		<h2>Employee Educational Information</h2>
		<form action="preview.jsp">
			
			<input type="hidden" name="name" value="<%=name%>">
			<input type="hidden" name="email" value="<%=email%>">
			<input type="hidden" name="contact" value="<%=contact%>">
		
			Enter Title <input type="text" name="title">
			<br><br>
			Enter Passing Year <input type="text" name="year">
			<br><br>
			Enter Percent <input type="text" name="percent">
			<br><br>
			<button type="submit">Next</button>
		</form>
	</div>
</body>
</html>
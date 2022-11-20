<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h1>User Login</h1>
		
<%
	String code = request.getParameter("code");
	String msg = "";
	String color = "";
	if(code != null) {
		switch(code) {
			case "-1" :
				msg = "Invalid User Name and Password";
				color = "red";
				break;
			case "1" :
				msg = "You have been successfully Logged out";
				color = "green";
				break;
		}
	}

%>	
		<h3 style="color:<%=color%>"><%= msg %></h3>
		
		<form action="auth" method="POST">
			Enter User Name : <input type="text" name="uname">
			<br><br>
			Enter Password : <input type="password" name="upass">
			<br><br>
			<button type="submit">Login</button>
		</form>
	</div>
</body>
</html>
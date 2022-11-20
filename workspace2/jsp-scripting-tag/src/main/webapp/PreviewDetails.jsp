<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Page</title>
</head>
<body>

<%
	String fn = request.getParameter("fname");
	String mn = request.getParameter("mname");
	String ln = request.getParameter("lname");
	String gender = request.getParameter("gender");
	String fullName = fn + " " + mn + " " + ln;
%>

<div align="center">
	<h1>User Name : <%= fullName %> </h1>
</div>

</body>
</html>
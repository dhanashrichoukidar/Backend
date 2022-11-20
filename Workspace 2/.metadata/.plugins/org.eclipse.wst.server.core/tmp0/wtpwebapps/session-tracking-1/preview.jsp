<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Details</title>
</head>
<body>

<%

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	
	String title = request.getParameter("title");
	String year = request.getParameter("year");
	String percent = request.getParameter("percent");

%>

	<div align="center">
		<h1>Step 3 of 3</h1>
		<hr>
		<h2>Employee Personal Information</h2>
		<h3>Name : <%= name %></h3>
		<h3>Email : <%= email %> </h3>
		<h3>Contact : <%= contact %></h3>
		
		<h2>Employee Educational Information</h2>
		<h3>Educational Title : <%= title %> </h3>
		<h3>Passing Year : <%= year %> </h3>
		<h3>Percentage : <%= percent %> </h3>
		
		<h1><a href="save-emp-dtl?name=<%=name%>&email=<%=email%>&contact=<%=contact%>&title=<%=title%>&year=<%=year%>&percent=<%=percent%>">Save & Continue</a></h1>
		
	</div>
	
</body>
</html>
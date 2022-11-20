<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
	<% 
		for(int i =1 ; i<=10 ; i++) {
			System.out.println(i);
		}
		int x = 10;
		print();
	%>
	
	<h2>Square : <%= x * x %>   </h2>
	
	<h1>Scripting Tags Demo</h1>
	
	
	
	<%!
		int y = 30;
		public void print() {
			
			System.out.println("This is a custom method on JSP page");
		}
	
	%>
	

	
	</body>
</html>
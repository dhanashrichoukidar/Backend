<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Address</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String quantity = request.getParameter("quantity");
	
	String name1 = request.getParameter("name1");
	String price1 = request.getParameter("price1");
	String quantity1 = request.getParameter("quantity1");
	
	
%>

	<div align="center">
		<h1>Step 2 of 4</h1>
		<hr>
		<h2>Billing Address</h2>
		<form action="shipping-add.jsp">
			
			<input type="hidden" name="name" value="<%=name%>">
			<input type="hidden" name="price" value="<%=price%>">
			<input type="hidden" name="quantity" value="<%=quantity%>">
			
			<input type="hidden" name="name1" value="<%=name1%>">
			<input type="hidden" name="price1" value="<%=price1%>">
			<input type="hidden" name="quantity1" value="<%=quantity1%>">
			
		
			City: <input type="text" name="city">
			<br><br>
			Pin-code: <input type="text" name="pincode">
			<br><br>
			State: <input type="text" name="state">
			<br><br>
			Country: <input type="text" name="country">
			<br><br>
			<button type="submit">Next</button>
		</form>
	</div>
</body>
</html>



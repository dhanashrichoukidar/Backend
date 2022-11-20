<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview-Order</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String quantity = request.getParameter("quantity");
	//convert a string to type double  
	 double x= Double.parseDouble(price); 
	 double y= Double.parseDouble(quantity); 
	double z = x * y;
	
	String name1 = request.getParameter("name1");
	String price1 = request.getParameter("price1");
	String quantity1 = request.getParameter("quantity1");
	//convert a string to type double
	double x1= Double.parseDouble(price1); 
	 double y1= Double.parseDouble(quantity1); 
	double z1 = x1 * y1;
	
	String city = request.getParameter("city");
	String pincode = request.getParameter("pincode");
	String state = request.getParameter("state");
	String country = request.getParameter("country");
	
	String city1 = request.getParameter("city1");
	String pincode1 = request.getParameter("pincode1");
	String state1 = request.getParameter("state1");
	String country1 = request.getParameter("country1");
%>

	<div align="center">
		<h1>Step 4 of 4</h1>
		<hr>
		<h1>Preview</h1>
		
		
		<h2>Billing Details</h2>
		<h3>Product-1</h3>
		
		<h4>Name : <%= name %></h4>
		<h4>Price : <%= price %> </h4>
		<h4>Quantity : <%= quantity %></h4>
		
		<h3>Product-2</h3>
		<h4>Name : <%= name1 %></h4>
		<h4>Price : <%= price1 %> </h4>
		<h4>Quantity : <%= quantity1 %></h4>
		
		
		<h2>Billing Address</h2>
		
		<h4>City : <%= city %></h4>
		<h4>Pin-code : <%= pincode %> </h4>
		<h4>State : <%= state %></h4>
		<h4>Country : <%= country %></h4>
	
		
		<h2>Shipping Address</h2>
		<h4>City : <%= city1 %></h4>
		<h4>Pin-code : <%= pincode1 %> </h4>
		<h4>State : <%= state1 %></h4>
		<h4>Country : <%= country1 %></h4>
		
		<h2>Total : <%= z + z1 %></h2>
		
		<h1><a href="#">Save & Continue</a></h1>
		
	</div>
	

</body>
</html>
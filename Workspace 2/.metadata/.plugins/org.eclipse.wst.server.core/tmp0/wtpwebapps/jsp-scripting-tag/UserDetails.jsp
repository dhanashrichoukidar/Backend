<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<h1>User Details</h1>
	<form action="PreviewDetails.jsp">
		Enter First Name : <input type="text" name="fname">
		<br><br>
		Enter Middle Name : <input type="text" name="mname">
		<br><br>
		Enter Last Name : <input type="text" name="lname">
		<br><br>
		Select Gender : <input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">Female
		<br><br>
		<button type="submit">Send Data</button>
	</form>
</div>



</body>
</html>3
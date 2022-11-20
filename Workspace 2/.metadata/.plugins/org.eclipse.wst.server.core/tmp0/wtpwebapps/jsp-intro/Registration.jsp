<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<div align="center">
		<form action="jspintro.jsp">
			Enter Name : <input type="text" name="name">
			<br/><br/>
			Enter Email : <input type="text" name="email">
			<br/><br/>
			Enter Password : <input type="text" name="password">
			<br/><br/>
			Enter DOB : <input type="date" name="dob">
			<br/><br/>
			Select Gender : <input type="radio" name="gender" value="male">Male
							<input type="radio" name="gender" value="female">Female
			<br/><br/>	
			Select City : <select>
							<option value="pune">Pune</option>
							<option value="pune">Mumbai</option>
							<option value="pune">Delhi</option>
						</select>
			<br/><br/>
			<button type="submit">Register</button>
		</form>
	</div>


</body>
</html>
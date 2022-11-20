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
		<form action="create-inquery">
			Enter Name : <input type="text" name="nm">
			<br><br>
			Enter Email : <input type="text" name="email">
			<br><br>
			
			Enter Contact : <input type="text" name="contact">
			<br><br>
			
			Select City : <select name="city">
								<option value="Pune">Pune</option>
								<option value="Mumbai">Mumbai</option>
								<option value="Delhi">Delhi</option>
							</select>
			<br><br>
			<button type="submit" >Save Inquery</button>
			
		</form>
	
	</div>
</body>
</html>
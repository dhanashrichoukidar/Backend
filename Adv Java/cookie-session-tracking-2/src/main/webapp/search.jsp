<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Query</title>
</head>
<body>


<%
	Cookie[] cks = request.getCookies(); // to get Cookies from the request.
	String search = "";
	if(cks!=null) {
		for(Cookie ck : cks) {
			if("search".equals(ck.getName())) {
				search = ck.getValue();
			}
		}
	}
%>

	<div align="center">
		<h1>Previously Search : <%= search %> </h1>
		<form action="result">
			Enter Query To Search : <input name="query">
			<br><br>
			<button type="submit">Get Result</button>
		</form>
	</div>


</body>
</html>
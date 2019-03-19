<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Display page</h1>
<form onsubmit="return Validate()" action="Registration.jsp" >

	<a href="DisplayIdServlet"></a><input type ="button" value= "Display All"></a></br></br>
	
	<input type ="button" value= "DisplayByID"></a>


	<select name="userId" value=value=<%= request.getParameter("userId") %>">
<option value="">please select any one</option>

</select>
<br>
	
	
	
	</form>
</body>
</html>
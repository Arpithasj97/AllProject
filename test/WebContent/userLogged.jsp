<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <center>
            <% prgm currentUser = (prgm (session.getAttribute("currentSessionUser"));%>
			
            Welcome <%= currentUser.getUName() + " " + currentUser.getpwd() %>
         </center>

</body>
</html>
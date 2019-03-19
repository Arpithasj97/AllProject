<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=3>
<tr>
		<th>Name</th>
		<th>Password</th>
</tr>

<%
ArrayList<AdminUser> a1 = (ArrayList<AdminUser>)request.getAttribute("custom");
Iterator<AdminUser> itr = a1.iterator();
while(itr.hasNext()){
	AdminUser adu = itr.next();
%>


<tr>
<td><%=adu.getUserid() %></td>
<td><%=adu.getPassword() %></td>
</tr>

<%} %>
</table>
<input type ="button" value ="Back"  onclick="openPage('AdminButtons.jsp')">
</body>
</html>
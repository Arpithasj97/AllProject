<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
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
ArrayList<Customer> a1 = (ArrayList<Customer>)request.getAttribute("custom");
Iterator<Customer> itr = a1.iterator();
while(itr.hasNext()){
	Customer adu = itr.next();
%>


<tr>
<td><%=adu.getuserId() %></td>
<td><%=adu.getpwd() %></td>
</tr>

<%} %>
</table>
<input type ="button" value ="Back"  onclick="openPage('Buttons.jsp')">
</body>
<script>
function openPage(pageURL){
	window.location=pageURL;
}
</script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ page import="java.util.*,com.spring.Customer" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  method="POST">

<table border=2>
<tr> <td>User Id</td> <td>User Name</td> <td>Phone</td> <td>Gender</td> </tr>

	<% List Customer=(List)request.getAttribute("customer");
	if(Customer!=null){
		Iterator itr = Customer.iterator();
		while(itr.hasNext()){
			Customer customer = (Customer)itr.next();
		
%>
<tr>
<td><%=customer.getUserId()%></td>
<td><%=customer.getName()%></td>
<td><%=customer.getPhoneNo()%></td>
<td><%=customer.getGender()%></td>
</tr>
<%}} else{%>
	
<tr colspan="3">No Data found</tr>
<%} %>
</table>
			
</form>
</body>
</html>
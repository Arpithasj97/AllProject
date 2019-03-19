<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Registration Form </h2>  
   <form method=get action="Registration.jsp" name="registration">
<table>
      <tr>
	     <td><label><b>username</b></label></td>
		 <td><input type="text" name="username" value="uname"/></td>
		 
		 <td><label><b>password</b></label></td>
		 <td><input type="text" name="password"/></td>
		 
	  </tr>
	  <tr>
	     <td><label><b>gender</b></label></td>
		 <td><input type="Radio" name="gender" value="male" checked/>Male
		      <input type="Radio" name="gender" value="female"/>Female</br>	     
		 </td>
      </tr>
      <tr>
          <td><label><b>Cities</b></label></td>
          <td><input type="checkbox" name="city" value="bnglr"/>Banglore
		       <input type="checkbox" name="city" value="chennai" />Chennai
			   <input type="checkbox" name="city" value="delhi"/>Delhi
			   <input type="checkbox" name="city" value="kolkata"/>Kolkata </br>
		  </td>
	  </tr>
	  <tr>
	   <td><label><b>Address</b></label></td>
	   <td><textarea rows="5" col="10" name="address"></textarea><br/>
	   </td>
	  </tr>
	  <tr>
	   <select name="technology"/>technologies
	       <option value="html">HTML</option>
		   <option value="css">CSS</option>
		   <option value="bootstrap">BOOTSTRAP</option>
		   <option value="js">JS</option>
	   </select><br/>
	  </tr>
	  <tr>
         <td> <button type="submit" name="submit">submit form</button>
			  <button name="Reset">reset form</button> 
			  <button name="button">click me</button>
		 </td>
	  </tr>
	</table>
	  </form>
<script>String username=request.getParameter("username")</script>
/<script>System.out.println(username)</script>

</body>
</html>
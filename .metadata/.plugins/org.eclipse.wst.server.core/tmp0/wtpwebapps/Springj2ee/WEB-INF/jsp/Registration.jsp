<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegForm</title>
</head>
<body>


<p>Hello JsP</p>


<form action="register" method="post">

			UserId:
			<input type="text"  id = "id1" name="UserId" value="${name}" /><br><br />
			
			First Name:
			<input type="text"  id = "id1" name="name"  /><br><br />
			<span id ="nameerror"></span>
			
			
			
			Gender:
			<input type="radio" name="gender" class= "g1" value="Male" /> Male
			<input type="radio" name="gender" class= "g1" value="Female"  /> Female&nbsp;<br><br />
			<span class="gendererror"></span>
			<br/>
			
			Phoneno:
			<input type="text" name="PhoneNo"/>&nbsp;<br><br />
			
			
			Technology:
			<select name="Technologies" multiple>
			<option value="html" class="t1"  name="technologies" >HTML</option>
			<option value="CSS" class="t1" name="technologies" >CSS</option>
			<option value="bootstrap" class="t1" name="technologies" >Bootstrap</option>
			<option value="js" class="t1" name="technologies" >JS</option>
			</select>
			<span class="techerror"></span>
			<br><br />
			
			<input type = "submit" > 
			<br>
<a href="Display.jsp">DISPLAY ALL</a>
<c:if test="${ not empty cutomers}">
$(customers)
<table border=2>
<tr>
<td>name</td>
<td>gender</td>
<td>technologies</td>
</tr>
<c:forEach var="customer" items=${customers}">
<tr>
<td>${customer.getName()}</td>
<td>${customer.getGender()}</td>
<td>${customer.getTechnologies()}</td>
</tr>
</c:forEach>c:forEach>





</table>
</c:if>
</form>
<!--  
<script type=text/javascript>
function Validate()
{

	
var flagName = nameValidate(name);
var flagGender = genderValidate();
var flagCity = cityValidate();
var flagtechnology = technologyValidate();


if(flagName && flagGender && flagCity && flagtechnology)
return true;
else
return false;

}
	function nameValidate(name)
	{
		var name=document.getElementById("id1").value;
		if(name.match("^[A-Za-z]+$"))
		return true;
		else
			document.getElementById("nameerror").innerHTML="Name can have only characters";	
		document.getElementById("nameerror").style.color="red";
		return false;
	}
	
	function genderValidate(gender)
	{
		var flag = false;
		var gender = document.getElementsByClassName("g1");
		for(var i = 0; i<gender.length;i++){
			if(gender[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}
		
		if(!flag){
			document.getElementsByClassName("gendererror").innerHTML="one of the radio button is not selected";
				document.getElementsByClassName("gendererror").style.color="red";
		}
		
		return flag;
	
	}
	function cityValidate(city)
	{
		var flag = false;
		var city=document.getElementsByClassName("c1");
		for(var i = 0; i<city.length;i++){
			if(city[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}	
		
		if(!flag){
			document.getElementsByClassName("cityerror").innerHTML="one of the checkbox is not selected";
				document.getElementsByClassName("cityerror").style.color="red";
		}
			
		return flag;
	}
	
	function technologyValidate()
	{
		var flag = false;
		var technology=document.getElementsByClassName("t1");
		for(var i = 0; i<technology.length;i++){
			if(technology[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}	
		
		if(!flag){
			document.getElementsByClassName("techerror").innerHTML="please select an option";
				document.getElementsByClassName("techerror").style.color="red";
		}
		return flag;
		
	}	


</script>-->

</body>
</html>
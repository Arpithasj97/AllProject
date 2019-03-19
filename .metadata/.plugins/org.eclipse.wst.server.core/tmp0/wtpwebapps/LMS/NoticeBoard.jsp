<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
body{
 background:url('https://thumbs.dreamstime.com/b/library-books-background-isolated-white-33423844.jpg') no-repeat;
background-size:cover;

}

input.delete{
float:right;
background-color:red;

}
input.primary{
background-color:yellow;
}
</style>
</head>  

<body>
<div>
<h2><center>Events</center></h2>



<ol>
  <li><h3>Workshop</h3></li>
  <li><h3>Graduation Day</h3></li>
  <li><h3>FareWell</h3></li>
  <li><h3>Relish</h3></li>
</ol> 
 <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br>
<div id=blahDiv>
<input type="button" id="updateButton" class="primary" onclick="productUpdate()" value="Add Event">
  

 <input type="button" value="Delete" class="delete" onclick="destroyDiv()">

</div>
</div>
<script type="text/javascript">
function productUpdate() {
  if ($("#productname").val() != null && $("#productname").val() != '') {
    // Add product to Table
    productAddToTable();
    // Clear form fields
    formClear();
    // Focus to product name field
    $("#productname").focus();
  }
}


      function destroyDiv() {

           var div = document.getElementById("level1");
           div.parentNode.removeChild(div);
      
      }
 </script>
 

         
       
</body>
</html>
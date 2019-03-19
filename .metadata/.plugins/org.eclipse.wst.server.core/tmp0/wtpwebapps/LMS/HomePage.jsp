<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>

<style>




/* The popup form - hidden by default */
.form-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;

}

/* Add styles to the form container */
.form-container {
  max-width: 300px;
  padding: 10px;
  background-color: white;
}

/* Full-width input fields */
.form-container input[type=text], .form-container input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background:#f1f1f1;/*white grey black*/
}

/* When the inputs get focus, do something */
.form-container :focus {
  background-color: #ddd;/*light shade of grey*/
  outline: none;
}



/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: red;
}

/* Add some hover effects to buttons 
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}*/
.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
    width: 100%;
    height:15%;
    margin: auto;
  }


</style>
</head>
<body>

<form >
 <div class="jumbotron text-center">
      <nav class="navbar navbar-inverse" style="top:-20px">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="#" >Library Management System</a>
            </div>
     
            <ul class="nav navbar-nav" style="float:right">
              <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Student Panel
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="registerlogin.jsp"><button type="button" class="btn btn-success"><i class="glyphicon glyphicon-log-in"></i>&nbsp;&nbsp;Login</button></li>
          <li><a href="signuplogin.jsp"><button type="button" class="btn btn-primary menu-bo"><i class="glyphicon glyphicon-user"></i>&nbsp;SignUp</button></a></li>
         
        </ul>
      </li>
    
      <ul class="nav navbar-nav" style="float:right">
              <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Teacher Panel
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="loginpage.html"><button type="button" class="btn btn-success"><i class="glyphicon glyphicon-log-in"></i>&nbsp;&nbsp;Login</button></a></li>
          <li><a href="#"><button type="button" class="btn btn-primary menu-bo "><i class="glyphicon glyphicon-user"></i>&nbsp;SignUp</button></a></li>
         
        </ul>
      </li>
       <ul class="nav navbar-nav" style="float:right">
              <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin Panel
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href=""><button type="button" class="btn btn-success"><i class="glyphicon glyphicon-log-in"></i>&nbsp;&nbsp;Login</button></a></li>
          <li><a href="#"><button type="button" class="btn btn-primary menu-bo "><i class="glyphicon glyphicon-user"></i>&nbsp;SignUp</button></a></li>
         
        </ul>
      </li>
        <li><a href="contactpage.html"><span class="glyphicon glyphicon-phone"></span>&nbsp;Contact Us</a></li>

            </ul>
           
          </div>
        </nav>
    <h1>LIBRARY MANAGEMENT SYSTEM</h1>
    <p>Welcome to Library Management System</p> 
  </div>
  <div class="container">
    <br>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        
      </ol>
  
      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
  
        <div class="item ">
          <img src="https://4.bp.blogspot.com/-xRj5me9KHy4/W2LYFGc2RtI/AAAAAAAAAb0/Nzcc300tTuwTMIbLEMK9X9Ou0jVeWE5GQCLcBGAs/s640/LibraryManagementHome%2B%25281%2529.PNG" alt="Chania" width="460" height="345">
          <div class="carousel-caption">
          
          </div>
        </div>
        
      
        <div class="item active">
          <img src="C:\Users\Arpitha\Downloads\LibraryManagementSystem.zip\LibraryManagementSystem\src\MainFiles\" alt="Flower" width="460" height="345">
          <div class="carousel-caption">
          </div>
        </div>
  
        <div class="item">
          <img src="https://d38trduahtodj3.cloudfront.net/images.ashx?t=ig&rid=CityOfNavasota&i=destiny_quest(4).png"" alt="Flower" width="460" height="345">
          <div class="carousel-caption">
           </div>   
        </div>
    
      </div>
  
      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>
  



 </form>
 
</body>
</html>
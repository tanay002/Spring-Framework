<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="css/header.css" rel="stylesheet" />
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/superfish.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>User Page</title>

</head>

<body>
 <div class="wrapper">  
      <div id="header">
        <div>
            <img src="images/logo.png" />
        </div>
        <div id="lin">
		    <a href=""> Welcome ${msg} <a>
	    </div>
	 </div>
	 <div class="menu1">
	    <ul class="main-menu">
		  <li class="current">
			   <a href="#">Admin</a>
			      <ul class="sub-menu">
			
			        <li class="current">
			           <a href="#">Login</a>
				           <ul class="dropdown-menu">
				               <li><a href="#">Admin Login</a></li>
				               <li><a href="loginp.do">Employee Login</a></li>
                          </ul>
                          </li>
                          
                          <li class="current">
                          <a href="#">Registration</a>
				           <ul class="dropdown-menu">
				               <li><a href="reg.do">Employee Registration</a></li>
                          </ul>
                     </li> 
                     
                     <li class="current">
                     <a href="viewNationality.do">View Nationality</a>
                     </li>
                     
               </ul>
               </li>
               </ul>
</div>
         
<script>

    jQuery(document).ready(function() {
        jQuery('ul.main-menu').superfish({
            pathClass: 'current',
            cssArrows: false,
            speed: 0,
            speedOut: 0
        });
    });
</script>
<br></br>
<%-- <h3>${msg}</h3>
<center><a href="viewNationality.do">View Nationality</a> --%>
</body>
</html>
	 
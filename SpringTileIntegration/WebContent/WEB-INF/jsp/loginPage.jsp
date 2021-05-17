<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
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
<h4>Login Page</h4>
<form action="#" method="post">
<table>
<tr><td>Email</td><td><input type="email" name="uEmail"></td></tr>
<tr><td>Password</td><td><input type="password" name="uPassword"></td></tr>
<tr><td><input type="submit" value="SignIn"></td><td><a href="reg.do">New User Signup</a></tr>
</table>
</form>
 <br>${msg}</br>
</center>

</body>
</html>
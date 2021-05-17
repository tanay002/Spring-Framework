<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title> 
</head>
<body>
<center>
<form action="checklogin.do" method="post">
<table>
<tr>
<td>Email<input type="text" placeholder="Enter Username" id="uemail" name="uemail"></td></tr>
<tr><td>Password<input type="password" placeholder="Enter Password" id="upass" name="upass"></td></tr>
<tr><td><input type="submit" value="login"></td></tr>
<tr><td><a href="doReg.do">Click Here for Registration</a></td></tr>
 <tr><td>${msg}</td></tr>
</table>
</form>
</center>
</body>
</html>
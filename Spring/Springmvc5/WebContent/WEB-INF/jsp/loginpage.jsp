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
<table>
<form>
<tr>
<td>Username<input type="text" placeholder="Enter Username"  name="uname"></td></tr>
<tr><td>Password<input type="password" placeholder="Enter Password" name="upass"></td></tr>
<tr><td><input type="submit" value="login"></td></tr>
<td><a href="doReg.do">Click Here for Registration</a></td>
 <tr><td>${msg}</td></tr>
</form>
</table>
</center>
</body>
</html>
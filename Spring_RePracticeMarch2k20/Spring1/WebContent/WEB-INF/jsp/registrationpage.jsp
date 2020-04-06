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
<form action="registerc.do" method=post>
<table>
<tr><td>Username</td><td><input type="text" name="uname"></td></tr>
<tr><td>Email</td><td><input type="email" name="email"></td></tr>
<tr><td>Password</td><td><input type="password" name="upass"></td></tr>
<tr><td>Mobileno</td><td><input type="text" name="umobileno"></td></tr>
<tr><td>Address</td><td><input type="text" name="add"></td></tr>
<tr><td>Gender</td><td><input type="radio" name="gender" value="male">Male  
				<input type="radio" name="gender" value="female">Female</td></tr>

<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form>
</center>

</body>
</html>
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
		<h4>Registration Page</h4>

		<form action="H" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fName"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lName"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="uEmail"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="uPassword"></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><input type="date" name="udob"></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="uCity"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>Male<input type="radio" name="gender" value="male">
						Female<input type="radio" name="gender" value="female"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
		<br>${msg}</br>
	</center>

</body>
</html>
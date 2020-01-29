<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<form action="changep.do" method="post">
<table>
<tr><td>Current Password<input type="text" name="upass"></td></tr>
<tr><td>New Password<input type="text" name="upass1"></td></tr>
<tr><td>Confirm Password<input type="text" name="upass2"></td></tr>
<tr><td><input type="submit" value="Change Password"></td></tr>
<tr><td>${msg}</td></tr>
</table>
</form>
</body>
</html>
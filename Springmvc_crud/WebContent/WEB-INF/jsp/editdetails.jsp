<%@page import="com.springmvc.UserDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${msg.uname}..!
<center>
<table>
<form action="updatedetails.do" method="get">
<tr><td>Email<input type="text" name="uemail" value="${msg.uemail}" readonly="readonly"></td></tr>
<tr><td>Username<input type="text" name="uname" value="${msg.uname}"></td></tr>
<tr><td>Mobileno<input type="text" name="umobile" value="${msg.umobile}"></td></tr>
<tr><td><input type="hidden" name="upass" value="${msg.upass}"></td></tr>
<tr><td><input type="submit" value="update"></td></tr>
</form>
</table>
</center>
</body>
</html>
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
<%-- <% String name=(String)session.getAttribute("umobile"); %> --%>
<%UserDto dto=(UserDto)session.getAttribute("dtoo"); %>
Welcome <%=dto.getUname()%>..!

<center>
<table>
<tr><td> <a href="editdetails.do">Click for edit Details</a></td></tr>
<tr><td><a href="viewalluser.do">View All Users</a></td></tr>
<tr><td><a href="changepass.do">Change Password</a></td></tr>
<tr><td><a href="logout.do">Logout</a></td></tr>
<tr><td>${msg1}</td></tr>
</table>
</center>
</body>
</html>
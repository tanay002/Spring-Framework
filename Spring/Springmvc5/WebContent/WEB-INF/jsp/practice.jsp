<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Mutiple Object Data</h1>
<table>

<th>Username</th>
<th>Mobileno</th>
<th>Email</th>

<c:forEach var="use" items="${data}">
<tr><td>${use.uname}</td><td>${use.uemail}</td><td>${use.umobile}</td></tr>
</c:forEach>  
</table>
</body>
</html>
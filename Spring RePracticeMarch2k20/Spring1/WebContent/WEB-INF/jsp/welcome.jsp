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
<%--4 Username: ${msg2}<br> --%>
<%-- 4 ${msg1} ${user.email} --%>

<%--5 Username: ${msg1.email} --%>

<%--6 --%>
<table>      
<th>Email</th>
<c:forEach var="use" items="${list}">
<tr><td>${use.email}</td></tr>
</c:forEach>
</body>
</html>
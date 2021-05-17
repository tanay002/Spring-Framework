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
<center>
<table>
<tr>
<th>Id  </th><th>Name</th><th>City</th></tr>
<c:forEach var="list" items="${msg}">
<tr>
<td>
${list.eId}  </td><td> ${list.eName}  </td><td> ${list.eCity}</td>
<br>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>
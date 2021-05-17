<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<table>

<th>Username</th>
<th>Mobileno</th>
<th>Email</th>
<th>Delete</th>
<form action="deleteData.do" method="post">

 <c:forEach var="use" items="${data}">
		<tr>
         <td><input type="text" name="uname" value="${use.uname}" readonly="readonly"></td>
     	<td><input type="text" name="uemail" value="${use.uemail}" readonly="readonly"></td>
     	<td><input type="text" name="umobile" value="${use.umobile}" readonly="readonly"></td>
     	<td><input type="hidden" name="upass" value="${use.upass}"></td>
     	 <td><input type="checkbox" name="check" value="${use.uemail}"/></td>
    </tr>
					
</c:forEach>
 <tr><td><input type="submit" value="Delete"></td></tr>
</form>
</table>
</center>
</body>
</html>
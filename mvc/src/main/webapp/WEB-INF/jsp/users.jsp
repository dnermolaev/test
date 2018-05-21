<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
<h3>Users</h3>
<a href="<c:url value="/addUser.html"/>">Add user</a>
 
 <table>
 <thead>
 <tr>
     <td>USER_ID</td>
     <td>USER_NAME</td>
     </tr>
 </thead>
   <c:forEach items="${users}" var="user">
   <tr>
     <td>${user.id}</td>
     <td><c:out value="${user.name}" escapeXml="true"/></td>
 </tr>
   </c:forEach>
 </table>
</body>
</html>
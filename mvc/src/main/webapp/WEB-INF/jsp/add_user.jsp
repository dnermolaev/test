<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add_user</title>
</head>
<body>
<h3>Add_users</h3>
<a href="<c:url value="/addUser.html"/>">Add user</a>
<form:form method="POST" commandName="user">
 <form:hidden path="id"/>
 <table>
   <tr>
     <td>USER_ID</td>
     <td><form:input path="USER_ID"/></td>
   </tr>
   <tr>
     <td>USER_NAME</td>
     <td><form:input path="USER_NAME"/></td>
   </tr>
   <tr>
<td colspan="2"><input type="submit" value="Сохранить"/></td>
   </tr>
 </table>
</form:form>
</body>
</html>
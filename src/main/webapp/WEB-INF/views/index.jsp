<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="green">${succmsg}</font>
<font color="red">${errmsg}</font>
<h2>Contact Saving form</h2>
<form:form action="save" modelAttribute="contactDTO" method="Post">
<table>
<tr>
<td>ContactName</td>
<td><form:input path="cname"/></td>
<td><form:hidden path="cid"/></td>
</tr>
<tr>
<td>ContactNumber</td>
<td><form:input path="cnum"/></td>
</tr>
<tr>
<td>Email</td>
<td><form:input path="email"/></td>
</tr>
</table>
<input type="submit" value="submit"/>

</form:form>
<a href="all">Display All Contacts</a>
</body>
</html>
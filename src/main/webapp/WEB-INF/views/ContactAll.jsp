<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body>
<script >
function deleteConfirm(){
	return confirm("do u want to delete the measage");
}
</script>

<h2>Contact list</h2>

<a href="index">+ADD Contact</a>

	<table border="0">
		<tr>
			<td>ContactName</td>
			<td>ContactNumber</td>
			<td>Email</td>
			<td>action</td>
		</tr>

		<c:forEach items="${allcontact}" var="cont">
			<tr>
				<td>${cont.cname}</td>
				<td>${cont.cnum}</td>
				<td>${cont.email}</td>
				<td>
				<a href="edit?cid=${cont.cid}">Edit</a>
				<a href="delete?cid=${cont.cid}" 
				onclick= return deleteConfirm()>Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
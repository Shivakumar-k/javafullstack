<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<th>Name</th>
			<th>Email</th>
			<th>Country</th>
			<th>Mobile</th>
			<th>Type</th>
			<th>Description</th>
		</thead>
		<br>
		<c:forEach items="${dtos}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.email}</td>
				<td>${item.mobile}</td>
				<td>${item.country}</td>
				<td>${item.type}</td>
				<td>${item.description}</td>
				<br>


			</tr>
		</c:forEach>

	</table>
</body>
</html>
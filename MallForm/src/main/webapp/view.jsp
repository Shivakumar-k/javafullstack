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
			<th>Mall Name</th>
			<th>Location</th>
			<th>No of Stores</th>
			<th>Purpose of Visit</th>
			<th>Parking</th>
			<th>Rating</th>
			<th>OpeningHours</th>
			<th>Name</th>
			<th>Email</th>
		  	<th>FeedBack</th>
		</thead>
		<br>
		<c:forEach items="${list}" var="mall">
			<tr>
				<td>${mall.mallName}</td>
				<td>${mall.location}</td>
				<td>${mall.numStores}</td>
				<td>${mall.category}</td>
				<td>${mall.parking}</td>
				<td>${mall.rating}</td>
				<td>${mall.openingHours}</td>
				<td>${mall.name}</td>
				<td>${mall.email}</td>
				<td>${mall.feedback}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="style.css" rel="stylesheet">
  <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<nav class="navbar bg-dark border-bottom border-bottom-dark">
	<div class="btn btn-outline-success">
		<a></a>
		<div>
			<a href="Welcome.jsp">Feedback Form</a>
		</div>
		</div>
		<div style="color: lightblue">Details</div>
		<div class="btn btn-outline-success" >
		<a href="Image.jsp">download</a>
		</div>
	
</nav>
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
		  	<th>File</th>
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
				<td><a target="_blank" href="downloadFile?fileName=${mall.originalFileName}&contentType=${mall.contentType}">${mall.fileName}</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
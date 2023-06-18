<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
<title>Search here</title>
<nav class="navbar bg-lightBlue">
<!-- <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://media.istockphoto.com/photos/letter-c-picture-id134636612" alt="Logo" width="36" height="30" class="d-inline-block align-text-top">
      Contact Form
    </a>
  </div> -->
  <div class="container-fluid justify-content-start">
  <a class="navbar-brand" href="#">
      <img src="https://media.istockphoto.com/photos/letter-c-picture-id134636612" alt="Logo" width="36" height="30" class="d-inline-block align-text-top">
      Contact Form
    </a>
    <button class="btn btn-sm btn-light me-2" type="button"><a href="Register.jsp">Register</button>
    <button class="btn btn-sm btn-light " type="button"> <a href="Search.jsp">Search</a> </button>
  </div>
</nav>
</head>
<body>
<form action="search" method="get">
Search Here: <input type="text" name="name" >

<input type="submit" value="Search" class="btn-warning">
</form>

<table class="table">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Comments</th>
			<th>File</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.name}</td>
				<td>${dto.email}</td>
				<td>${dto.mobile}</td>
				<td>${dto.comments}</td>
				<td>${dto.originalFileName}</td>
			</tr>
		</c:forEach>


	</table>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
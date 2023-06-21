<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">

<style type="text/css">
label {
	width: 100px;
	display: inline-block;
	margin: 4px;
}

#form {
	border-radius: 10px;
	background: lightblue;
	color: black;
	width: 300px;
	padding: 20px;
	left: 65%;
	top: 50%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}
</style>
<body class="text-center">
	<nav class="navbar bg-success">
		<div class="container-fluid justify-content-start">
			<a class="navbar-brand" href="#"> <img
				src="https://pngimg.com/uploads/letter_p/letter_p_PNG77.png"
				alt="Logo" width="36" height="30"
				class="d-inline-block align-text-top"> Admin - Parking Rental
				System
			</a>
			<button class="btn btn-sm btn-light me-2" type="button">
				<a href="Home.jsp">Home
			</button>
			<button class="btn btn-sm btn-light " type="button">
				<a href="User.jsp">User</a>
			</button>
		</div>
	</nav>
	</head>

<h3>Admin Sign in</h3>
	<div id="form">
		<form action="admin" method="get">
			<div>
				<label>Admin Mail:</label> <input type="email" name="amail">
			</div>
			<br>
			<div>
				<label>Password:</label><input type="password" name="aPassword">
			</div>
			<br>
			<div>
				<input type="submit" value="Sign In">
			</div>

		</form>
	</div>
</body>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
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

.form {
	border-radius: 10px;
	background: lightblue;
	color: rgb(155, 50, 80);
	width: 300px;
	padding: 20px;
	left: 65%;
	top: 50%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}

footer {
	position: absolute;
	bottom: 0;
	width: 100%;
}
</style>

<nav class="navbar bg-success">
	<div class="container-fluid justify-content-start">
		<a class="navbar-brand" href="#"> <img
			src="https://pngimg.com/uploads/letter_p/letter_p_PNG77.png"
			alt="Logo" width="36" height="30"
			class="d-inline-block align-text-top" style="color: red"> Admin
			- Parking Rental System
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
<body class="text-center">

	<h4 style="color: red">${error}</h4>
	<h3>Admin Sign in</h3>
	<div class="form">
		<form action="admin" method="get">
			<div>
				<label>Admin Mail:</label> <input type="email" name="email">
			</div>
			<br>
			<div>
				<label>Password:</label><input type="password" name="password">
			</div>
			<br>
			<div>
				<input type="submit" value="Sign In">
			</div>

		</form>
	</div>
	<ul class="nav">

		<footer id="footer">
			<nav class="navbar bg-success">
				<div class="container-fluid justify-content-start">
					<div class="footer-content">
						<!-- Add your footer content here -->
						<p>&copy; 2023 Parking Rental. All rights reserved.</p>
						<p>Contact: shivakumar.k.xworkz@gmail.com</p>
					</div>
				</div>
			</nav>
		</footer>

	</ul>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
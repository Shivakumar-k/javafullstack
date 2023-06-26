<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<h1>Enter below details</h1>

<br>

	<h4 style="color: red">${error}</h4>

	<form action="info" method="post">

		<div>
			<label>Location :</label> <input type="text" name="location">
		</div>
		<br>
		<div>
			<label>Vehicle Type :</label> <input type="text" name="vehicleType">
		</div>
		<br>
		<div>
			<label>Vehicle Fuel Type :</label> <input type="text" name="vehicleFuelType">
		</div>
		<br>
		<div>
			<label>Vehicle Brand :</label> <input type="text" name="vehicleBrand">
		</div>
		<br>
		<div>
			<label>Rental Terms :</label> <input type="text" name="rentalTerms">
		</div>
		<br>
		<div>
			<label>Price :</label> <input type="number" name="price">
		</div>
		<br>
		<div>
			<label>discount :</label> <input type="number" name="discount">
		</div>

       <div><input type="submit" value="Save"></div>



	</form>


</body>
</html>
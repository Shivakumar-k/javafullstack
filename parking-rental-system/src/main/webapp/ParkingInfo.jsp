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
			<label>Vehicle Type</label> <select name="vehicleType">
					<option value="">--select option--</option>
					<option value="TWO WHEELER">TWO WHEELER</option>
					<option value="FOUR WHEELER">fOUR WHEELER</option>
					
				</select>
		</div>
		<br>
		<div>
			<label>Vehicle Fuel Type </label> <select name="vehicleFuelType">
					<option value="">--select option--</option>
					<option value="Petrol">Petrol</option>
					<option value="Diesel">Diesel </option>
					<option value="ELECTRIC">ELECTRIC</option>
				</select>
		</div>
		<br>
		<div>
			<label>Vehicle Brand</label> <select name="vehicleBrand">
					<option value="">--select option--</option>
					<option value="Tata">Tata</option>
					<option value="Hyundai">Hyundai</option>
					<option value="Wolkswagon">Wolkswagon</option>
					<option value="MG Hector">MG Hector</option>
					<option value="Merc">Merc</option>
				</select>
		</div>
		<br>
		<div>
			<label class="col-form-label">Rental Terms </label> <select name="rentalTerms">
					<option value="">--select option--</option>
					<option value="1 Day">1 Day</option>
					<option value="15 Days">15 Days</option>
					<option value="30 Days">30 Days</option>
					<option value="90 Days">90 Days</option>
					<option value="180 Days">180 Days</option>
					<option value="360 Days">360 Days</option>
				</select>
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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
<nav class="navbar bg-success">
	<div class="container-fluid justify-content-start">
		<a class="navbar-brand" href="#"> <img
			src="https://pngimg.com/uploads/letter_p/letter_p_PNG77.png"
			alt="Logo" width="36" height="30"
			class="d-inline-block align-text-top" style="color: red"> User
			- Parking Rental System
		</a>
		<button class="btn btn-sm btn-light me-2" type="button">
			<a href="Home.jsp">Home</a>
		</button>

	</div>

</nav>
<style type="text/css">
label {
	width: 100px;
	display: inline-block;
	margin: 4px;
}
</style>
</head>
<body class="text-center">
	<h1>User Page</h1>
	<h4 style="color: green">${parkingInfoSuccess}</h4>
	<h4 style="color: red">${error}</h4>

	<form action="userSign" method="post">

		<div class="form-group">
			<label>Name:</label><input type="text" name="name">
		</div>
		<br>
		<div>
			<label>Email:</label><input type="email" name="email">
		</div>
		<br>
		<div>
			<label>Mobile:</label><input type="text" name="mobile">
		</div>
		<br>
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
				<option value="Diesel">Diesel</option>
				<option value="Electric">Electric</option>
			</select>
		</div>
		<br>
		<div>
			<label>Vehicle Brand</label> <select name="vehicleBrand">
				<option value="">--select option--</option>
				<option value="Tata">Tata</option>
				<option value="Hyundai">Hyundai</option>
				<option value="Wolkswagon">Volkswagon</option>
				<option value="MG Hector">MG Hector</option>
				<option value="Merc">Merc</option>
				<option value="BMW">BMW</option>
				<option value="Enfield">Enfield</option>
				<option value="Yamaha">Yamaha</option>
			</select>
		</div>
		<br>
		<div>
			<label class="col-form-label">Rental Terms </label> <select
				name="rentalTerms">
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
		<br>
		<div>
			<label>Total :</label> <input type="number" name="total">
		</div>

		<div>
			<input type="submit" value="Save">
		</div>
	</form>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
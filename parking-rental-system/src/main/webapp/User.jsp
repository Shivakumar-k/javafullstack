<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<h1>User Page</h1>
	<h1>${parkingInfoSuccess}</h1>
	<h1>${error}</h1>

	<form action="userSign" method="post">

		<div>
			<label>Name:</label><input type="text" name="name">
		</div>
		<div>
			<label>Email:</label><input type="email" name="email">
		</div>
		<div>
			<label>Mobile:</label><input type="text" name="mobile">
		</div>

		<div>
			<label>Location :</label> <input type="text" name="location">
		</div>
		<br>
		<div>
			<label>Vehicle Type :</label> <input type="text" name="vehicleType">
		</div>
		<br>
		<div>
			<label>Vehicle Fuel Type :</label> <input type="text"
				name="vehicleFuelType">
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
		<br>
		<div>
			<label>Total :</label> <input type="number" name="total">
		</div>

		<div>
			<input type="submit" value="Save">
		</div>


	</form>


</body>
</html>
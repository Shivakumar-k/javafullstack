<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.
    com/docs/5.3/assets/css/docs.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Update</title>
<style type="text/css">
footer {
  position: absolute;
  bottom: 0;
  width: 100%;
}

</style>
<nav class="navbar bg-success">
  <div class="container-fluid justify-content-start">
    <a class="navbar-brand" href="#">
      <img src="https://pngimg.com/uploads/letter_p/letter_p_PNG77.png" alt="Logo" width="36" height="30" class="d-inline-block align-text-top">
      Update -Parking Rental System
    </a>
    <br>
    <button class="btn btn-sm btn-light " type="button">
				<a href="User.jsp">User</a>
			</button>
  </div>
</nav>
</head>
<body class="text-center">
<h1>Update Parking Info</h1>
<a class="btn btn-primary" href="ParkingInfo.jsp">Update Parking Info</a>

<br>
<form action="search" method="get">
Search Here: <input type="text" name="location" placeholder="Enter Location" >

<input type="submit" value="Search" class="btn-warning"  >
</form>

<table class="table">
		<tr>
			<th>Location</th>
			<th>Vehicle Type</th>
			<th>Vehicle Fuel Type</th>
			<th>Vehicle Brand</th>
			<th>Rental Terms</th>
			<th>Price</th>
			<th>Discount</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.location}</td>
				<td>${dto.vehicleType}</td>
				<td>${dto.vehicleFuelType}</td>
				<td>${dto.vehicleBrand}</td>
				<td>${dto.rentalTerms}</td>
				<td>${dto.price}</td>
				<td>${dto.discount}</td>
			</tr>
		</c:forEach>


	</table>

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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>	
</body>
</html>
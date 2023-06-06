<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Mall</title>
<nav class="navbar bg-green-dark border-bottom border-bottom-dark" data-bs-theme="dark">
	<div class="container-fluid">
		<a></a> <a href="view">View Details</a>
	</div>
	</nav>

</head>

<h1>Welcome</h1>
<h4 style="color: green">${msg}</h4>
 <h4 style="color: red"> <c:forEach var="error" items="${errors}">
                <li>${error.defaultMessage}</li>
            </c:forEach></h4>
<body>
<pre>
<center>
<form action="send" method="post">
  
   <label>Mall Name:</label> 
 <input type="text" name="mallName" required>
   
 <label>Location:</label> 
 <input type="text" name="location" required>
  
 <label>Number of Stores:</label> 
 <input type="number" name="numStores" required>
  
  <label>Category: </label>
  <select name="category">
    <option value="shopping">Shopping</option>
    <option value="entertainment">Entertainment</option>
    <option value="dining">Dining</option>
    <option value="All the above">All the above</option>
    <option value="Explore">Explore</option>
  </select>
  
 <label>Parking Available:</label>
  <label><input type="radio" id="parkingYes" name="parking"
					value="yes"> Yes</label>
  <label><input type="radio" id="parkingNo" name="parking"
					value="no"> No</label>
 
  <label>Rating:</label>
  <input type="radio" id="rating1" name="rating" value="1"><label>1</label>
  <input type="radio" id="rating2" name="rating" value="2"><label>2</label>
  <input type="radio" id="rating3" name="rating" value="3"><label>3</label>
  <input type="radio" id="rating4" name="rating" value="4"><label>4</label>
  <input type="radio" id="rating5" name="rating" value="5"><label>5</label>
  
  <label>Opening Hours:</label>
  <input type="text" name="openingHours" required>
  
  <label>Name :</label>
  <input type="text" name="name">
  
  <label>Email:</label>
  <input type="email" name="email" required>
  
  <label>Feedback:</label>
  <textarea name="feedback" rows="4" required></textarea>
  <div class="d-grid gap-2 col-2 mx-auto">
  <input class="btn btn-primary" type="submit" value="Submit">
  </div>
  
</form> 


</pre>
</center>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
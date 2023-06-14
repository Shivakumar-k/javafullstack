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
<title>Mall</title>
	<nav class="navbar bg-dark border-bottom border-bottom-dark">
	<div class="btn btn-outline-success">
		<a></a>
		<div>
			<a href="view">View Details</a>
		</div>
		</div>
		<div style="color: lightblue">Mall Feedback Form</div>
		<div class="btn btn-outline-success" >
		<a href="Image.jsp">download</a>
		</div>
	
</nav>
<script>
function forChar() {
	var mallName = document.getElementById("Name");
	console.log(mallName.value);
	var errMall = document.getElementById("errMallName");
	if(mallName.value!='' && mallName.value.length>3 && mallName.value.length<20 ){
		errMall.innerHTML=''
		
	}else{
		errMall.innerHTML='enter valid MALL NAME';
		errMall.style.color='red'
	}
		
}

</script>

</head>

<h1>Welcome</h1>
<h4 style="color: green">${msg}</h4>
 <h4 style="color: red"> <c:forEach var="error" items="${errors}">
                <li>${error.defaultMessage}</li>
            </c:forEach></h4>
<body>
<pre>

<form action="send" method="post" enctype="multipart/form-data">
  
  Mall Name:
 <input type="text" name="mallName" onchange="forChar()" id="Name" required>
 <span id="errMallName" ></span>
   
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
 
  
  <label>Image: <input type="file" name="file"></label>
  
   <div class="d-grid gap-2 col-2 mx-auto">
  <input class="btn btn-primary" type="submit" value="Submit">
  </div>
</form> 
</pre>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
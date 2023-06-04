<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Mall</title>
<nav class="navbar bg-green border-bottom border-bottom-green" data-bs-theme="">
 
<div class="container-fluid">
    <span class="navbar-text">
     <form action="view" method="post">
<input type="submit" value="view details">
</form>
    </span>
</nav>


</head>
<h4 style="color: green">${msg}</h4>
<body>
<h1>Welcome</h1>
<pre>
<form action="send" method="post">
  
   <label>Mall Name:</label> 
 <input type="text" name="mallName" required>
   
 <label>Location:</label> 
 <input type="text"  name="location" required>
  
 <label>Number of Stores:</label> 
 <input type="number"  name="numStores" required>
  
  <label>Category: </label>
  <select id="category" name="category">
    <option value="shopping">Shopping</option>
    <option value="entertainment">Entertainment</option>
    <option value="dining">Dining</option>
    <option value="All the above" >All the above</option>
    <option value="Explore">Explore</option>
  </select>
  
 <label>Parking Available:</label>
  <label><input type="radio" id="parkingYes" name="parking" value="yes"> Yes</label>
  <label><input type="radio" id="parkingNo" name="parking" value="no"> No</label>
 
  <label>Rating:</label>
  <input type="radio" id="rating1" name="rating" value="1"><label >1</label>
  <input type="radio" id="rating2" name="rating" value="2"><label >2</label>
  <input type="radio" id="rating3" name="rating" value="3"><label >3</label>
  <input type="radio" id="rating4" name="rating" value="4"><label >4</label>
  <input type="radio" id="rating5" name="rating" value="5"><label >5</label>
  
  <label>Opening Hours:</label>
  <input type="text"  name="openingHours" required>
  
  <label >Name :</label>
  <input type="text" name="name">
  
  <label>Email:</label>
  <input type="email"  name="email" required>
  
  <label >Feedback:</label>
  <textarea  name="feedback" rows="4" required></textarea>
  <div class="d-grid gap-2 col-2 mx-auto">
  <input class="btn btn-primary" type="submit" value="Submit">
  </div>
  
  <!--  
       <div >
        <label for="inputEmail3" class="col-sm-2 col-form-label">Mall Name</label>
        <div class="col-sm-2">
          <input type="text" class="form-control" id="inputEmail3" fdprocessedid="zce42w">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
          <input type="password" class="form-control" id="inputPassword3" fdprocessedid="n0qq9">
        </div>
      </div>
      <fieldset class="row mb-3">
        <legend class="col-form-label col-sm-2 pt-0">Radios</legend>
        <div class="col-sm-10">
          <div class="form-check">
            <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked="">
            <label class="form-check-label" for="gridRadios1">
              First radio
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
            <label class="form-check-label" for="gridRadios2">
              Second radio
            </label>
          </div>
          <div class="form-check disabled">
            <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" disabled="">
            <label class="form-check-label" for="gridRadios3">
              Third disabled radio
            </label>
          </div>
        </div>
      </fieldset>
      <div class="row mb-3">
        <div class="col-sm-10 offset-sm-2">
          <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck1">
            <label class="form-check-label" for="gridCheck1">
              Example checkbox
            </label>
          </div>
        </div>
      </div>
      <button type="submit" class="btn btn-primary" >Sign in</button>
      -->
</form>

</pre>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
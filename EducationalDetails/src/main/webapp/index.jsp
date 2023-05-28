<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>

	<pre>
<form action="send" method="post">

<h2>Educational details</h2>

Name
<input type="text" name="name">

Qualification
<select name="Qualification">
  <option value="">Select an option</option>
  <option value="B.E">B.E</option>
</select>

Stream :
<select name="stream">
  <option value="">Select an option</option>
  <option value="Mechanical">Mechanical</option>
  <option value="Civil">Civil</option>
  <option value="CSE">CSE</option>
  <option value="EC">EC</option>
</select>
 
University :
<select name="Uni">
  <option value="">Select an option</option>
  <option value="VTU">VTU</option>
  <option value="Autonomous">Autonomous</option>
  <option value="Others">Others</option>
 
</select>
 
 
 College
 <input type="text" name="college">
 
 City
 <input type="text" name="city">
 
 State
 <input type="text" name="state">
 
 Country
 <input type="text" name="country">
 
 <input type="submit" value="send">
 

</form>
</pre>

</body>
</html>
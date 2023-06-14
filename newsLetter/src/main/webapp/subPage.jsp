<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>News Letter</title>
</head>
<body>

<h1>Hey there!</h1>
<pre>
<form action="sub" method="post" >

<label>Name:<input type="text" name="name"></label>

<label>Email:<input type="email" name="email"></label>

<label>Mobile Number:<input type="text" name="number"></label>

<label>Intrests:</label>
<input type="checkbox" id="interest1" name="interest" value="sports">
<label for="interest1">Sports</label>

<input type="checkbox" id="interest2" name="interest" value="Business">
<label for="interest2">Business</label>

<input type="checkbox" id="interest3" name="interest" value="Technology">
<label for="interest3">Technology</label>

<input type="checkbox" id="interest3" name="interest" value="Space">
<label for="interest4">Space</label>

<input type="submit" value="Subscribe">

</form>
</pre>

</body>
</html>
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
<form action="sub" method="post" enctype="multipart/form-data">

<label>Name:<input type="text" name="name"></label>

<label>Email:<input type="email" name="email"></label>

<label>Mobile Number:<input type="text" name="number"></label>

<label>Intrests:</label>
<input type="checkbox" id="intrest1" name="intrest" value="sports">
<label for="interest1">Sports</label>

<input type="checkbox" id="intrest2" name="intrest" value="Business">
<label for="interest2">Business</label>

<input type="checkbox" id="intrest3" name="intrest" value="Technology">
<label for="interest3">Technology</label>

<input type="checkbox" id="intrest3" name="intrest" value="Space">
<label for="interest4">Space</label>

<label>file:<input type="file" name="file" ></label>

<input type="submit" value="Subscribe">

</form>
</pre>

</body>
</html>
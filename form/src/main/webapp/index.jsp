<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>

<body>
<h1>Welcome to form</h1>
<h1>${error}</h1>
 <pre>
<form action="save" method="post" >

Name: <input type="text" name="name">
<br>
Email: <input type="email" name="email">
<br>
Age: <input type="number" name="age">
<br>
City: <input type="text" name="city">
<br>
<input  type="submit" value="click"></form>
</pre>
</body>
</html>
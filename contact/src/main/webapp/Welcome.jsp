<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Contact App</h1>
 

<pre>

<form action="send" method="post" >

Name: <input type="text" name="name" >
Email: <input type="email" name="email" >
Country: <select name="country">
  <option value="">Select an option</option>
  <option value="India">India</option>
  <option value="Russia">Russia</option>
  <option value="USA">USA</option>
  <option value="UK">UK</option>
</select>
Mobile NO: <input type="text" name="mobile" >
Type : <select name="type">
  <option value="">Select an option</option>
  <option value="India">Family</option>
  <option value="Russia">Friend</option>
  <option value="USA">Colleague</option>
  <option value="UK">Spam</option>
</select>
Description:
 <textarea name="description"></textarea>
<input type="submit" value= "save">

</form>
</pre>

</body>
</html>
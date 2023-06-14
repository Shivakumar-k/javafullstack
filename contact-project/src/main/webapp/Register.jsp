<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>

<h1>Welcome!</h1>


<h1>${errMsg}</h1>
<h1>${successmsg}</h1> 
<pre>
<form action="save" method="post" enctype="multipart/form-data"}>

<label>Name:</label><input type="text" name="name">

<label>Email:</label><input type="email" name="email">

<label>Mobile Number:</label><input type="number" name="mobile">

<label>Comments: </label><textarea name="comments"></textarea>

<label>File:</label><input type="file" name="file" >

<input type="submit" value="Save">

</form>
</pre>

</body>
</html>
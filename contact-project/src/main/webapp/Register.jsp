<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
<title>Register Page</title>
<nav class="navbar bg-success">
  <form class="container-fluid justify-content-start">
    <button class="btn btn-sm btn-light me-2" type="button" href="Details.jsp">View Details</button>
    <button class="btn btn-sm btn-light " type="button" href="Download.jsp">Download</button>
  </form>
</nav>
</head>
<body>

<h1 class="text-center">Welcome!</h1>

<h1>${errMsg}</h1>
<h1>${successmsg}</h1> 
<pre >
<div class="text-center">
<form action="save" method="post" enctype="multipart/form-data"}>
<div class="form-label">
<label>Name:</label><input type="text" name="name">
</div>
<div class="form-label">
<label>Email:</label><input type="email" name="email">
</div>
<div class="form-label">
<label>Mobile Number:</label><input type="number" name="mobile">
</div>
<label>Comments: </label><textarea name="comments"></textarea>

<label>File:</label><input type="file" name="file" >

<input type="submit" value="Save">

</form>
</div>
</pre>
</body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
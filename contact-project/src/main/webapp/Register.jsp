<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
<title>Register Page</title>
<style type="text/css">

label{
width:100px;
display: inline-block;
margin: 4px;
}

#form{

border-radius:10px;
background: hsl(240, 25%, 50%);
color:black;
width:600px;
padding:20px;
left:50%;
top:50%;
margin-left:-25%;
position:absolute;
margin-top: -8%;

}


</style>

<nav class="navbar bg-success">
<!-- <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://media.istockphoto.com/photos/letter-c-picture-id134636612" alt="Logo" width="36" height="30" class="d-inline-block align-text-top">
      Contact Form
    </a>
  </div> -->
  <div class="container-fluid justify-content-start">
  <a class="navbar-brand" href="#">
      <img src="https://media.istockphoto.com/photos/letter-c-picture-id134636612" alt="Logo" width="36" height="30" class="d-inline-block align-text-top">
      Contact Form
    </a>
    <button class="btn btn-sm btn-light me-2" type="button"><a href="Details.jsp">View Details</button>
    <button class="btn btn-sm btn-light " type="button"> <a href="Search.jsp">Search</a> </button>
  </div>
</nav>
<script>
function forChar() {
	var Name = document.getElementById("Name");
	console.log(Name.value);
	var errN = document.getElementById("errName");
	if(Name.value!='' && Name.value.length>3 && Name.value.length<20 ){
		errN.innerHTML=''
		
	}else{
		errN.innerHTML='Enter valid NAME';
		errN.style.color='red'
	}
		
}

function forEmail() {
	var email = document.getElentByID("Email1");
	console.log(email.value);
	var errEmail = document.getElementById("errEmail");
	if(email.value!='' && email.value.length>5 && email.value.length<20 ){
		errEmail.innerHTML=''	
	}else{
		errEmail.innerHTML='Enter valid Email';
		errEmail.style.color='red'
	}
	
}
</script>
</head>
<body>

<h1 class="text-center">Welcome!</h1>

<h1>${errMsg}</h1>
<h1>${successmsg}</h1>
 
<pre >
<div class="text-center">
<form action="save" method="post" enctype="multipart/form-data">
<div class="form-label">
<label>Name:</label><input type="text" id="Name" onchange="forChar()" name="name">
<span id="errName" ></span>
</div>
<div class="form-label">
<label>Email:</label><input type="email" id="Email1" onchange="forEmail()" name="email">
<span id="errEmail" ></span>
</div>
<div class="form-label">
<label>Mobile Number: </label><input type="number" name="mobile">
</div>
<label>Comments: </label><textarea name="comments"></textarea>

<label>File:</label><input type="file" name="file" >

<input type="submit" value="Save">

</form>
</div>
</pre>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</html>
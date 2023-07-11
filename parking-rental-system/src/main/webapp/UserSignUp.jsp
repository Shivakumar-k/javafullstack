<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="SignUp" method="post">
		<div>
			<label>UserName:</label> <input type="text" name="name">
		</div>
		<div>
			<label>Email:</label> <input type="email" name="email">
		</div>
		<div>
			<label>Password:</label><input type="password" name="password">
		</div>
		<div>
			<label>Mobile:</label> <input type="number" name="mobile">
		</div>
		<div>
			<label>Address</label> <input type="text" name="address">
		</div>
		<input type="submit" value="SignUp">


	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h4>
		<a href="UserSignUp.jsp">SignUp</a>
	</h4>
	
	<h4 style="color: green">${success}</h4>
	<h4> ${failure }</h4>
	<h4 style="color: green">${verifiedSuccessfully}</h4>
	<h4 style="color: red">${verificationFailure}</h4>
<body>
	<form action="SignIn" method="post">
		<div>
			<label>Email:</label> <input type="email" name="email">
		</div>

		<!-- <div>
			<label>OTP:</label><input type="text" name="otp">
		</div> -->
		<div>
			<input type="submit" value="SignIn">
		</div>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="Welcome.jsp">welcome</a>

<form action="downloadFile"  method="get">
<div>File Name<input type="text" name="fileName" ></div>
<div>Content Type<input type="text" name="contentType"></div>
<div><input type="submit" value="download" ></div>

</form>

</body>
</html>
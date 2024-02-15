<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Entered details</h1>
<h1>${success}</h1>

Name: <%=request.getParameter("name") %>
<br>
Email: <%=request.getParameter("email") %>
<br>
Age: <%=request.getParameter("age") %>
<br>
City: <%=request.getParameter("city") %>
</body>
</html>
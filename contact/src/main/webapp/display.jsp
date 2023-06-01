<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>

<h4 style="color: green">${msg}</h4>

<body>
<pre>
Name: <%=request.getParameter("name") %>
Email: <%=request.getParameter("email") %>
Country: <%=request.getParameter("country") %>
Mobile No: <%=request.getParameter("mobile") %>
Type: <%=request.getParameter("type") %>
Description: <%=request.getParameter("description") %>
</pre>
</body>
</html>
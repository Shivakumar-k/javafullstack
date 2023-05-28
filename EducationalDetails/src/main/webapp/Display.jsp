<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Name: <%=request.getAttribute("Name") %>
<br>
Qualification: <%=request.getAttribute("Qualification") %>
<br>
Stream: <%=request.getAttribute("stream") %>
<br>
University: <%=request.getAttribute("Uni") %>
<br>
Collage: <%=request.getAttribute("collage") %>
<br>
City: <%=request.getAttribute("city") %>
<br>
State: <%=request.getAttribute("state") %>
<br>
Country: <%=request.getAttribute("country") %>

<br>

Name:${name}



</body>
</html>
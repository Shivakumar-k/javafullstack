<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Fav Food:
	<%=request.getAttribute("food")%>
	<br> Fav place:
	<%=request.getAttribute("Place")%>
	<br> Fav person:
	<%=request.getAttribute("Person")%>
	<br> lap1:
	<%=request.getAttribute("laptop1")%>

	<br> lap1:${laptop1}
	<br> lap2:${laptop2}
	<br> lap3:${laptop3}

</body>
</html>
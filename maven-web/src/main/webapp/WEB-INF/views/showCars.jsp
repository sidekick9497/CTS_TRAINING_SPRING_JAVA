<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello from show cars</h1>
	<core:forEach var="car" items="${cars}">
			
			<h2>${car.name }</h2>
			<span>  cost = ${car.cost}</span>
			<span> ${car.id}</span>
			<br> 
		</core:forEach>
</body>
</html>
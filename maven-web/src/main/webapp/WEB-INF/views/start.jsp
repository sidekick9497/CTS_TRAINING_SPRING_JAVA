<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>gaming</title>
</head>
<body>
	<marquee> game started</marquee>
	<h1>${game.name}</h1>
	<h1>${game.genre}</h1>
	
	<core:forEach var="tag" items="${game.tags}">
	<li>${tag}</li>
	</core:forEach>
</body>
</html>-->
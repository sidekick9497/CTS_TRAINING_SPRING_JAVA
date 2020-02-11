<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Details</title>
		
</head>
<body>
<h1> ENTER CAR DETAILS</h1>
		<spring:form action="/maven-web/addCars" method="post" modelAttribute="cars">
		<pre>
			<label>Car Name </label><spring:input path="name" type="text"/>
			<label>Car Cost</label><spring:input path="cost" type="text"/>
			<input type="submit"/>
		</spring:form>
		</pre>
</body>
</html>
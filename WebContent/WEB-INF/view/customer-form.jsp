<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>
<style>
	.error{color:red}
</style>
</head>
<body>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<h1>Welcome Customer</h1>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="customerModel">
		Enter first name: <form:input path="firstName"/>
		<br>
		<br>
		Enter last name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>
		<br>
		Free passes: <form:input path="passes"/>
		<form:errors path="passes" cssClass="error"/>
		<br>
		<br>
		Postal code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br>
		<br>
		Course code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		<br>
		<input type="submit" value="Submit!" />
	</form:form>
</body>
</html>
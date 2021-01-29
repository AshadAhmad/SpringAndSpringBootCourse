<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br>
		<br>
		Last Name: <form:input path="lastName"/>
		<br>
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countries}"/>
			<!-- <form:option value="India" label="India"/>
			<form:option value="America" label="America"/>
			<form:option value="Nepal" label="Nepal"/>
			<form:option value="Russia" label="Russia"/> -->
		</form:select>
		<br>
		<br>
		Java <form:radiobutton path="codingLanguage" value="Java"/>
		
		Python <form:radiobutton path="codingLanguage" value="Python"/>
		
		JavaScript <form:radiobutton path="codingLanguage" value="JavaScript"/>
		
		C++ <form:radiobutton path="codingLanguage" value="C++"/>
		
		C <form:radiobutton path="codingLanguage" value="C"/>
		
		<br>
		<br>
		
		Operating System:
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		MacOs <form:checkbox path="operatingSystems" value="MacOs"/>
		Windows <form:checkbox path="operatingSystems" value="Linux"/>
		<br>
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>
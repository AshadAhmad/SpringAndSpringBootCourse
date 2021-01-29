<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	<h1>
		The student is confirmed: ${student.firstName} ${student.lastName} and he belongs to ${student.country}.
		Student's desired language to code is ${student.codingLanguage}.
		Student's preferred choice of Operating Systems are:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
		
	</h1>
</body>
</html>
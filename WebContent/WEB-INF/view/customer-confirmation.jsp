<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation!</title>
</head>
<body>
	<h1>The customer ${customerModel.firstName} ${customerModel.lastName} is confirmed and they have ${customerModel.passes} passes, postal code of the customer is ${customerModel.postalCode}, and customer opted for course ${customerModel.courseCode}</h1>

</body>
</html>
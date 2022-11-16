<%@ page import="java.util.Date,org.Learn_java.jsp.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working with class</title>
</head>
<body>

	<% out.print(new java.util.Date()); %>
	<br>
	<%= new Date() %>
	<br>
	<% out.print(new UserDefined().Demo()); %>
</body>
</html>
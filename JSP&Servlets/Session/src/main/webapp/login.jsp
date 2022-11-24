<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/SiteController" method="post">
	Username : <input type="text" name="username" placeholder="enter your username">
	<br>
	Password : <input type="password" name="password" placeholder="enter your password">
	<br>
	<input type="hidden" name="action" value="loginSubmit">
	<input type="submit" value="Submit">
</form>
</body>
</html>
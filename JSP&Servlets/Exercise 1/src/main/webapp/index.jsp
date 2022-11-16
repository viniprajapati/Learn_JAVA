<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h3>It's home page</h3>

<a href="<%= request.getContextPath() %>/Controller?page=login">Login</a>
<br>
<a href="<%= request.getContextPath() %>/Controller?page=signup">Sign up</a>
<br>
<a href="<%= request.getContextPath() %>/Controller?page=about">About</a>
<br>
</body>
</html>
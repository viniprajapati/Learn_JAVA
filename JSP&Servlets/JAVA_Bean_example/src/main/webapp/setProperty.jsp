<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Property</title>
</head>
<body>
<jsp:useBean id="user" class="org.Learn_java.Beans.User" scope="application"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Vini"/>
<jsp:setProperty property="lastName" name="user" value="Prajapati"/>
Value has been updated
</body>
</html>
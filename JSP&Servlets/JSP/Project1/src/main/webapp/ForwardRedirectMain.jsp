<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward and Redirect main file</title>
</head>
<body>
It's from the original page
<jsp:forward page="forward.jsp"></jsp:forward>

<%
	/* request.getRequestDispatcher("forward.jsp").forward(request, response); */
	response.sendRedirect("redirect.jsp");
%>
</body>
</html>
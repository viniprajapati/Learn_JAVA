<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submitted form details</title>
</head>
<body>
Name : <%= request.getParameter("name") %>
<br>
Gender : <%= request.getParameter("gender") %>
<br>
Languages : <%
String[] lang = request.getParameterValues("language");
if(lang != null){
	for(int i=0; i<lang.length; i++){
		out.print("<br>");
		out.print(lang[i]);
	}
}else{
	out.print("None Selected");
}
%>
<br>
Country : <%= request.getParameter("country") %>
</body>
</html>
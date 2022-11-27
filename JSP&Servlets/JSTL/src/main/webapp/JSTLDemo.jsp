<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>


	<c:set var="name" value="Vini"></c:set>
	<c:out value="${name}"></c:out>
	<c:remove var="name"/>
	<c:out value="${name}"></c:out>
	${param.msg}
	
	<h6>****************************************</h6>
	<!-- JSTL for loop -->
	<c:forEach var="i" begin="1" end="30" step="3">
		${i}
		<t>
	</c:forEach>
	<br>
	<h6>****************************************</h6>
	<!-- JSTL foreach loop  -->
	<%
		String[] names = new String[3];
		names[0] = "Vini";
		names[1] = "Prisa";
		names[2] = "Trisa";
	%>
	
	<c:forEach items="<%= names %>" var="name">
		${ name }<br>
	</c:forEach>
	<h6>****************************************</h6>
	<!-- JSTL fortoken -->
	<c:forTokens items="www.javatpoint.com" delims="." var="temp">
			${temp}<br>
	</c:forTokens>
	
	<br>
	<p>*********************</p>
	${ url }
</body>
</html>
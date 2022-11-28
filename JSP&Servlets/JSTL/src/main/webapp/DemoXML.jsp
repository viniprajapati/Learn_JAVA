<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL XML Demo</title>
</head>
<body>
	<c:import url="http://localhost:8080/JSTL_Demo/UserXML.xml" var="XMLFile"></c:import>
	<x:parse doc="${XMLFile }" var="XMLdoc"></x:parse>
	
	<!-- Get specific index value from xml file -->
	<label>Name :</label>  <x:out select="$XMLdoc/users/user[2]/name"/>
	<br>
	<label>Gender :</label>  <x:out select="$XMLdoc/users/user[2]/gender"/>
	<br>
	<label>Age :</label>  <x:out select="$XMLdoc/users/user[2]/age"/>
	<br>
	
	<p>*****************************</p>
	
	<!-- XML Foreach loop  -->
	<x:forEach select="$XMLdoc/users/user">

		<x:if select="age > 25">
			<br><label>Name :</label>  <x:out select="name"/>
			
			<br><label>Gender :</label>  <x:out select="gender"/>
			
			<br><label>Age :</label>  <x:out select="age"/>
			<br>
		</x:if>
	</x:forEach>
		
	<p>*****************************</p>
	
	
	<!--  Tabular information by filtering female only data -->
	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Gender</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
			<x:forEach select="$XMLdoc/users/user">
				<x:choose>
					<x:when select="gender='Female'">
						<tr>
							<td> <x:out select="name"/> </td>
							
							<td> <x:out select="gender"/> </td>
							
							<td> <x:out select="age"/> </td>	
						</tr>
					</x:when>
				</x:choose>
			</x:forEach>
		</tbody>
	</table>
</body>
</html>
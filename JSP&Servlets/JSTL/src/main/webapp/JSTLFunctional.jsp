<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Functional Tag</title>
</head>
<body>

<!-- Calculate the length of objects.  -->
<%
 String[] name = {"vini", "nidhi", "riya"};
%>
<c:set var="nameArray" value="<%= name %>" />
<p>The length of array is : ${fn:length(nameArray) }</p>

<!-- Calculate the length of variable -->
 <p>The length of string is : ${fn:length("Hii,there") }</p>
 
 <!-- Remove redundant space from the text  -->
 ${fn:trim("        hii            ,     there") }
 
 <!-- escape html tags to work -->
 <h5>EscapeXML Demo</h5>
 ${fn:escapeXml("<h5>EscapeXML Demo</h5>") }
 
 <c:set var="We" value="javatpoint.com" />
 <p>String starts with "j" is : ${fn:startsWith("javatpoint.com", "j") }</p>
 <p>String ends with "com" is : ${fn:endsWith(We, "com") }</p>
 <p>String ends with "COM" is :  ${fn:endsWith(We, "COM") }</p>
 <p>String contains "COM" is : ${fn:containsIgnoreCase("javatpoint.com","COM") }</p>
 <br>
 <p>*****************************</p>
 <br>
 <!-- functions work with string  -->
 <p>To Upper case : ${fn:toUpperCase("javatpoint.com") }</p>
 <p>To Lower case : ${fn:toLowerCase("VINI PRAJAPATI") }</p>
 <p>Index of char "p" is : ${fn:indexOf("Vini Prajapati", "p") }</p>
 <p>Replace the text "vini" to "java" : ${fn:replace("hii, vini", "vini","java") }</p>
 <p>Substring from 2 to 5 is : ${fn:substring("hii, vini prajapti", 2, 5) }</p>
 <p>Substring after "vini" is : ${fn:substringAfter("hii, vini prajapti", "vini") }</p>
 <p>Substring before "vini" is : ${fn:substringBefore("hii, vini prajapti", "vini") }</p>
<br>
 <p>*****************************</p>
 <br>
 
 <c:set var="elements" value="${fn:split('www.javatpoint.com','.') }" />
 <c:forEach var="element" items="${elements}">
	${element }<t>
 </c:forEach>
 <br>
 Elements : ${fn:join(elements,".") }
</body>
</html>
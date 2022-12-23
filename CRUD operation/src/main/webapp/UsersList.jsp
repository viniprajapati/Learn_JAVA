<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
     <sql:query var="listUsers" dataSource="jdbc/learn_java">
     	select username, email from users;
     </sql:query>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<caption><h2>List of users</h2></caption>
		<tr>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.username}" /></td>
                    <td><c:out value="${user.email}" /></td>
                </tr>
            </c:forEach>
	</table>

</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="include/header.jsp"></c:import>
<c:set var="name" value="Hi"></c:set>
${name}
<br>
<a href="<c:url value="JSTLDemo.jsp" />">JSTL Demo Page</a>

<!-- Redirect to external url  -->
<%-- <c:redirect url="http://javatpoint.com"></c:redirect> --%>

<!-- Redirect to internal page  -->
<%-- <c:redirect url="JSTLDemo.jsp"></c:redirect> --%>
<br>

<c:catch var="exception">
	<% int x=10/0; %>
</c:catch>
${ exception }
<br>
<p>Print only msg of the exception</p>
${ exception.message }
<br>

<%
	String URL = "<a href='http://javatpoint.com'>JavaTpoint</a>";
	
	ServletContext context = getServletContext();
	
	context.setAttribute("url", URL);
%>
${ url }
<c:import url="include/footer.jsp"></c:import>
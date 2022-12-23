<%@ include file="/include/header.jsp" %>
<%@page import="java.util.List"%>
<%@page import="org.Learn_java.entity.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- content Start -->
    <div class="container-fluid mb-5 body-div" style="/* padding-top: 9rem;  padding-bottom: 6rem;*/">
        <div class="container">
        
            <div class="row g-4 align-items-end mb-4">
               
               <div class="wow fadeInUp" data-wow-delay="0.3s">
                   
                    <h1 class="display-5 mb-4">List User</h1>
                    <div class="table-responsive">
                    
	                    <table class="table table-striped">
	                    	<thead>
	                    		<tr>
	                    			<th scope="col">User ID</th>
	                    			<th scope="col">Username</th>
	                    			<th scope="col">Email</th>
	                    			<th scope="col">Actions</th>
	                   			</tr>
	                    	</thead>
	                    	<tbody>
	                    		<!-- Adding JSTL support  -->
	                    		<c:forEach items="${listUsers}" var="user">
	                    			
	                    			<c:url var="updateURL" value="operation">
	                    				<c:param name="page" value="updateUser"></c:param>
	                    				<c:param name="userId" value="${ user.user_id }"></c:param>
	                    				<c:param name="username" value="${user.username }"></c:param>
	                    				<c:param name="email" value="${user.email }"></c:param>
	                    			</c:url>
	                    			
	                    			<c:url value="operation" var="deleteURL">
	                    				<c:param name="page" value="deleteUser"></c:param>
	                    				<c:param name="userId" value="${ user.user_id }"></c:param>
	                    			</c:url>
	                    			
	                    			<tr>
	                    				<td>${user.user_id}</td>
	                    				<td>${user.username }</td>
	                    				<td>${user.email }</td>
	                    				<td>
	                    					<a href="${updateURL }"><i class='fas fa-edit'></i></a>&nbsp;
	                    					<a href="${deleteURL }" onclick="if(!confirm('Are you aure to delete the user?')) return false"><i class="fas fa-trash-alt text-danger"></i></a>
	                    				</td>
	                    			</tr>
	                    		</c:forEach>
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
                    			<%! //String deleteURL; %>
	                    		<%
	                    			/* String updateURL;
	                    			List<User> listUsers = (List) request.getAttribute("listUsers");
	                    			for(int i=0; i < listUsers.size(); i++){
	                    				out.print("<tr>");
	                    				out.print("<td scope='col'>"+listUsers.get(i).getUser_id()+"</td>");
	                    				out.print("<td scope='col'>"+listUsers.get(i).getUsername()+"</td>");
	                    				out.print("<td scope='col'>"+listUsers.get(i).getEmail()+"</td>");
	                    				updateURL = request.getContextPath()+"/operation?page=updateUser&userId="+listUsers.get(i).getUser_id()+"&email="+listUsers.get(i).getEmail()+"&username="+listUsers.get(i).getUsername();
	                    				deleteURL = request.getContextPath()+"/operation?page=deleteUser&userId="+listUsers.get(i).getUser_id();
	                    				out.print("<td scope='col'><a href="+updateURL+"><i class='fas fa-edit'></i></a>&nbsp;"); */
                   				%>
	                    			
			                    		<%-- <a href="<%=deleteURL%>" onclick="if(!confirm('Are you aure to delete the user?')) return false">
			                    			<i class="fas fa-trash-alt text-danger"></i>
		                    			</a> 
	                    			</td>
	                    		</tr>--%>
	                    		<% //} %>
	                    	</tbody>
	                    </table>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>
    <!-- content End -->
<%@ include file="/include/footer.jsp" %>
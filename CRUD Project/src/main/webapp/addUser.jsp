<%@ include file="/include/header.jsp" %>

<!-- content Start -->
<div class="container-fluid mb-5 body-div" style="/* padding-top: 9rem;  padding-bottom: 6rem;*/">
	<div class="container">

		<div class="row g-4 align-items-end mb-4">
		       
			<div class="col-lg-6 wow fadeInUp" data-wow-delay="0.3s">
		       <form action="${pageContext.request.contextPath }/operation" method="post" enctype="multipart/form-data">
		       	
		       		<label>Username : </label>
		       		<input type="text" name="username" required="required"><br>
		       		
		       		<label>Email :</label>
		       		<input type="email" name="email" required="required"><br>
		       		
		       		<label>Profile Image :</label>
		       		<input type="file" name="profile_img" multiple="multiple">
		       		
		       		<input type="hidden" name="form" value="addUserOperation">
		       		<input type="submit" value="Add User">
		       </form>
			</div>
			
		</div>
		
	</div>
	
</div>
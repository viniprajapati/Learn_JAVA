<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title><% 
    	if(request.getAttribute("title") == null)
    	{
    		out.print("Home");
    	}else{
    		out.print(request.getAttribute("title"));
    	}
    	%>
   	</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="./assets/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;500&display=swap"
        rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="./assets/lib/animate/animate.min.css" rel="stylesheet">
    <link href="./assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="./assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="./assets/css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Spinner Start -->
    <!-- <div id="spinner"
        class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;"></div>
    </div> -->
    <!-- Spinner End -->


    <!-- Navbar Start -->
    <div class="container-fluid fixed-top px-0 wow fadeIn" data-wow-delay="0.1s">
        <div class="top-bar row gx-0 align-items-center d-none d-lg-flex">
            <div class="col-lg-6 px-5 text-start">
                <small><i class="fa fa-map-marker-alt text-primary me-2"></i>123 Street, New York, USA</small>
                <small class="ms-4"><i class="fa fa-clock text-primary me-2"></i>9.00 am - 9.00 pm</small>
            </div>
            <div class="col-lg-6 px-5 text-end">
                <small><i class="fa fa-envelope text-primary me-2"></i>info@example.com</small>
                <small class="ms-4"><i class="fa fa-phone-alt text-primary me-2"></i>+012 345 6789</small>
            </div>
        </div>

        <nav class="navbar navbar-expand-lg navbar-light py-lg-0 px-lg-5 wow fadeIn" data-wow-delay="0.1s">
            <a href="${pageContext.request.contextPath}/site?page=home" class="navbar-brand ms-4 ms-lg-0">
                <h1 class="display-5 text-primary m-0">Finanza</h1>
            </a>
            <button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse"
                data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto p-4 p-lg-0">
                    <a href="${pageContext.request.contextPath}/site?page=home" class="nav-item nav-link active">Home</a>
                    <a href="${pageContext.request.contextPath}/operation?page=listUser" class="nav-item nav-link">List User</a>
                    <a href="${pageContext.request.contextPath}/operation?page=addUser" class="nav-item nav-link">Add User</a>
                    
                    <!-- <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                        <div class="dropdown-menu border-light m-0">
                            <a href="../project.html" class="dropdown-item">Projects</a>
                            <a href="../feature.html" class="dropdown-item">Features</a>
                            <a href="../team.html" class="dropdown-item">Team Member</a>
                            <a href="../testimonial.html" class="dropdown-item">Testimonial</a>
                            <a href="../404.html" class="dropdown-item">404 Page</a>
                        </div>
                    </div>
                    <a href="../contact.html" class="nav-item nav-link">Contact</a> -->
                </div>
                
            </div>
        </nav>
    </div>
    <!-- Navbar End -->
    
    <div class="container-fluid page-header wow fadeIn" data-wow-delay="0.1s">
	    <div class="container">
	        <!--  <h1 class="display-3 mb-4 animated slideInDown">Contact</h1> -->
	        <nav aria-label="breadcrumb animated slideInDown">
	            <ol class="breadcrumb mb-0">
	                <li class="breadcrumb-item"><a href="#">Home</a></li>
	                <li class="breadcrumb-item active" aria-current="page"><% 
				    	if(request.getAttribute("title") == null)
				    	{
				    		out.print("Home");
				    	}else{
				    		out.print(request.getAttribute("title"));
				    	}
				    	%></li>
	            </ol>
	        </nav>
	    </div>
	 </div>
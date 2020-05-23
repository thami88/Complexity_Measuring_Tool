<%@ page import="com.Handler.ReadFile"%>
<%@ page import="com.Handler.FileUploadHandler"%>
<%@ page import="com.size.ComplexityMeasure"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<meta charset="ISO-8859-1">

<title>Home</title>

<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.0/css/mdb.min.css" rel="stylesheet">

</head>
<body>


	<!--Navbar-->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark special-color-dark">
		<!-- Collapse button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#basicExampleNav" aria-controls="basicExampleNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- Collapsible content -->
		<div class="collapse navbar-collapse" id="basicExampleNav">

			<!-- Links -->
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="Home.jsp">Home<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link" href="ControlStructures.jsp">Complexity CS</a></li>
				<li class="nav-item"><a class="nav-link" href="SizeVariable.jsp">Complexity Size</a></li>
				<li class="nav-item"><a class="nav-link" href="WeightControlStructure.jsp">Weight CS</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Weight Size</a></li>
				<li class="nav-item"><a class="nav-link" href="TotalComplexity.jsp">Total Complexity</a></li>
			</ul>
			<!-- Links -->
		</div>
		<!-- Collapsible content -->
	</nav>

	<!-- ---------------------------- End of Nav ----------------------------- -->

    <!-- -------------------------- Main Container --------------------------- -->

	<div class="container-fluid pt-5">

		<div class="container text-center pt-5">
			<div class="row">
				<div class="col">
					<p class="h4 mb-4">Upload Files</p>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row">
				<div class="col">

					<form action="FileUploadHandler" enctype="multipart/form-data" method="post" class="border border-light">
						<div class="input-group mb-3">
  							<div class="custom-file d-flex justify-content-center m-5 p-5">
								<input type="file" name="file2" class="border border-light" style="width: 500px;">
								<input type="submit" class="input-group-append" value="UPLOAD">
							</div>
						</div>

					
					</form>
					
					
					<%
						String file_name = (String) request.getParameter("filename");
					if (file_name != null) {
						out.println(" File uploaded successfuly");
					}
					%>


					<%
						if (file_name != null) {
						ReadFile Obj = new ReadFile();
						out.print(Obj.read());
					}
					%>
				</div>
			</div>
		</div>

	</div>

	<footer class="page-footer font-small special-color-dark fixed-bottom pt-5">

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">Complexity Tool</div>
		<!-- Copyright -->

	</footer>



</body>
</html>
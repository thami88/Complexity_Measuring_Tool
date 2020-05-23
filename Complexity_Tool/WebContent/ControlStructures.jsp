<%@ page import="com.ControlStructures.ComplexityMeasureCs"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Control Structure Complexity</title>

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
				<li class="nav-item"><a class="nav-link" href="Home.jsp">Home</a></li>
				<li class="nav-item active"><a class="nav-link" href="ControlStructures.jsp">Complexity CS<span class="sr-only">(current)</span></a></li>
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
	
	<div class="container-fluid pt-5">

		<div class="container text-center pt-4">
			<div class="row">
				<div class="col">

	<table class="table table-hover text-center table-bordered">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Line no</th>
				<th scope="col">Program statements</th>
				<th scope="col">Wtcs</th>
				<th scope="col">NC</th>
				<th scope="col">Ccspps</th>
				<th scope="col">Ccs</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>class Pattern {</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">2</th>
				<td>public static void main(String[] args) {</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">3</th>
				<td>int rows = 5;</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">4</th>
				<td>for(int i = 1; i <= rows; ++i) {</td>
				<td>3</td>
				<td>1</td>
				<td></td>
				<td>3</td>

			</tr>
			<tr>
				<th scope="row">5</th>
				<td>for(int j = 1; j <= i; ++j) {</td>
				<td>3</td>
				<td>1</td>
				<td>3</td>
				<td>6</td>

			</tr>
			<tr>
				<th scope="row">6</th>
				<td>System.out.print(j + " ");</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">7</th>
				<td>}</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">8</th>
				<td>System.out.println("");</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">9</th>
				<td>}</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">10</th>
				<td>}</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
			<tr>
				<th scope="row">11</th>
				<td>}</td>
				<td></td>
				<td></td>
				<td></td>
				<td>0</td>

			</tr>
		</tbody>
	</table>
	
				</div><!-- Close Column -->
			</div><!-- Close Row -->
		</div><!-- Close Container -->
	</div><!-- Close Main Conteiner -->
	
	
	<footer class="page-footer font-small special-color-dark pt-5">

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">Complexity Tool</div>
		<!-- Copyright -->

	</footer><!-- End of Footer -->

</body>

</html>
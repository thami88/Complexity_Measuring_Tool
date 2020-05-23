<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Total Complexity</title>

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
				<li class="nav-item"><a class="nav-link" href="ControlStructures.jsp">Complexity CS<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link" href="SizeVariable.jsp">Complexity Size</a></li>
				<li class="nav-item"><a class="nav-link" href="WeightControlStructure.jsp">Weight CS</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Weight Size</a></li>
				<li class="nav-item active"><a class="nav-link" href="TotalComplexity.jsp">Total Complexity<span class="sr-only">(current)</span></a></li>
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
				<th scope="col">Cs</th>
				<th scope="col">Ccs</th>
				<th scope="col">TCps</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>class Pattern {</td>
				<td>2</td>
				<td>0</td>
				<td>2</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>public static void main(String[] args) {</td>
				<td>4</td>
				<td>0</td>
				<td>4</td>

			</tr>
			<tr>
				<th scope="row">3</th>
				<td>int rows = 5;</td>
				<td>2</td>
				<td>0</td>
				<td>2</td>
			</tr>
			<tr>
				<th scope="row">4</th>
				<td>for(int i = 1; i <= rows; ++i) {</td>
				<td>8</td>
				<td>3</td>
				<td>11</td>

			</tr>
			<tr>
				<th scope="row">5</th>
				<td>for(int j = 1; j <= i; ++j) {</td>
				<td>8</td>
				<td>6</td>
				<td>14</td>
				

			</tr>
			<tr>
				<th scope="row">6</th>
				<td>System.out.print(j + " ");</td>
				<td>8</td>
				<td>0</td>
				<td>8</td>
			</tr>
			<tr>
				<th scope="row">7</th>
				<td>}</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<th scope="row">8</th>
				<td>System.out.println("");</td>
				<td>6</td>
				<td>0</td>
				<td>6</td>
			</tr>
			<tr>
				<th scope="row">9</th>
				<td>}</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<th scope="row">10</th>
				<td>}</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<th scope="row">11</th>
				<td>}</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr class="grey lighten-2">
				<th  scope="row"></th>
				<td><h4>Total</h4></td>
				<td><h4>38</h4></td>
				<td><h4>9</h4></td>
				<td><h4>48</h4></td>
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
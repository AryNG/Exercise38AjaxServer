<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Ajax Server</h2>
	
	<form>
	<div class="form-control">
	<label for="txtName">Employee Name</label>
	<input type="text" class="form-control" id="txtName" name="txtName" placeholder="Susan Jhonson">
	</div>
	
	<br>
	
	<label for="txtSalary">Salary</label>
	<input type="text" class="form-control" id="txtSalary" name="txtSalary" placeholder="$0.0">
	<br>
	<input type="button" class="btn btn-info" id="btnSalary" name="btnSalaryFinal" value="Calculate Salary">
	<br>
	<div id="SalaryFinal"></div>
	
	<br>
	
		<h2>Ajax Server</h2>
		<h3>Exercise 2</h3>
	<label for="txtName2">Employee Name</label>
	<input type="text" id="txtName2" name="txtName2" placeholder="Susan Jhonson">
	<br>
	<label for="txtSalary2">Salary</label>
	<input type="text" id="txtSalary2" name="txtSalary2" placeholder="$0.0">
	<br>
	<input type="button" class="btn btn-info"id="btnSalary2" name="btnSalaryFinal2" value="Calculate Salary">
	<br>
	<div id="SalaryFinal2"></div>
	</form>
	
	<script src="js/script.js"></script>
</body>
</html>
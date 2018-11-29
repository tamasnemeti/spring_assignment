<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring</title>
</head>
<body>
	<h1>Adding a record to a MySQL database</h1>
	<hr>
	<div class="form">
	<form action="result" method="post">
		<table>
			<tr>
				<th>Name</th>
				<th>Birthday</th>
				<th>Neptun ID</th>
			</tr>
			<tr>
				<td><input id="name" name="name"></td>
				<td><input id="bday" name="bday"></td>
				<td><input id="neptun" name="neptun"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring</title>
</head>
<body>
	<h1>Spring Web App</h1>
	<hr>
	<div class="form">
	<form action="hello" method="post" onsubmit="return validate()">
		<table>
			<tr>
				<td>Enter your name</td>
				<td><input id="name" name="name"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>
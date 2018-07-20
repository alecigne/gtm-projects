<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link href="https://fonts.googleapis.com/css?family=Mina" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
	<h1>Linked page</h1>
	<table>
		<tr>
			<th>Scoped variable</th>
			<th>Current value</th>
		</tr>
		<tr>
			<td>Page scope</td>
			<td>${scopeVarPage}</td>
		</tr>
		<tr>
			<td>Request scope</td>
			<td>${scopeVarRequest}</td>
		</tr>
		<tr>
			<td>Session scope</td>
			<td>${scopeVarSession}</td>
		</tr>
		<tr>
			<td>Application scope</td>
			<td>${scopeVarApplication}</td>
		</tr>
	</table>

	<br>

	<a href="index.jsp">Back</a>

</body>
</html>
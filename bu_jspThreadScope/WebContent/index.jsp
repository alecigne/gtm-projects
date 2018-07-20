<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="scopeVarPage" value="Page Value" scope="page" />
<c:set var="scopeVarRequest" value="Request Value" scope="request" />
<c:set var="scopeVarSession" value="Session Value" scope="session" />
<c:set var="scopeVarApplication" value="Application Value"
	scope="application" />
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

	<h1>Index page</h1>

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

	<h1>Included page</h1>

	<jsp:include page="included.jsp" />

	<br>

	<a href="linked.jsp">Go to linked page</a>

</body>
</html>
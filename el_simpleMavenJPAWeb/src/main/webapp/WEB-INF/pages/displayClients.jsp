<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Proxibanque : Liste des clients de Proxibanque</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<c:forEach items="${clients}" var="currentClient">
		<tr>
			<td>${currentClient.nom}</td>
			<td>${currentClient.prenom}</td>
		</tr>
	</c:forEach>
</body>
</html>
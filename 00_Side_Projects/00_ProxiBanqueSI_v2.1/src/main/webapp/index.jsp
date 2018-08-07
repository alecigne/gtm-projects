<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ProxiBanque - menu conseiller</title>
<jsp:include page="/WEB-INF/parts/header.html"></jsp:include>
</head>
<body>
	<h1>Bienvenue, ${conseillerSession.prenom} ${conseillerSession.nom} (${conseillerSession.login})</h1>
	<ul>
		<li><a href="profil.jsp">Votre profil</a></li>
		<li><a href="ListerClients">Gestion des clients</a></li>
		<li><a href="operations.html">Operations bancaires</a></li>
	</ul>
	<jsp:include page="/WEB-INF/parts/footer.html"></jsp:include>
</body>
</html>
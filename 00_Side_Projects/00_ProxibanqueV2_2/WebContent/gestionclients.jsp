<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxiBanque - gestion client</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Liste des clients de ProxiBanque</h3>
	</div>
	<div id="content">
		<div class="column1">
			<img alt="" src="tous-clients.jpg" />
		</div>
		<div class="column2" align="center">
			<a href="creerclient.html">Créer un nouveau client</a><br>
			<p>Sélectionner un client :</p>
			<table border="1 px solid black">
				<tr>
					<th>ID client</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Adresse</th>
					<th>Code postal</th>
					<th>Ville</th>
					<th>Téléphone</th>
				</tr>
				<c:forEach items="${allClients}" var="currentClient">
					<tr>
						<td><a
							href="gestionclient.jsp?idClient=${currentClient.idClient}">${currentClient.idClient}</a></td>
						<td>${currentClient.nom}</td>
						<td>${currentClient.prenom}</td>
						<td>${currentClient.adresse}</td>
						<td>${currentClient.codePostal}</td>
						<td>${currentClient.ville}</td>
						<td>${currentClient.telephone}</td>
					</tr>
				</c:forEach>
			</table>
			<br> <a href="index.jsp">Retour au menu principal</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
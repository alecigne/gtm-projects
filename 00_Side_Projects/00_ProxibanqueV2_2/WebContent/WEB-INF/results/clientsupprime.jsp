<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Proxibanque - client supprimé</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Supression du client : ${clientSupprime.prenom} ${clientSupprime.nom}</h3>
	</div>
	
	<p>Rappel des informations du client supprimé :</p>
	
	<div id="content">
		<div class="article column1">
			<img alt="" src="info-client.png" />
		</div>
		<div class="article column2" align="center">
			<form>
				<fieldset>
					<legend>
						<b>Etat civil</b>
					</legend>
					<table>
						<tr>
							<td>ID :</td>
							<td>${clientSupprime.idClient}</td>
						</tr>
						<tr>
							<td>Nom :</td>
							<td>${clientSupprime.nom}</td>
						</tr>
						<tr>
							<td>Prenom :</td>
							<td>${clientSupprime.prenom}</td>
						</tr>
						<tr>
							<td>Adresse :</td>
							<td>${clientSupprime.adresse}</td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td>${clientSupprime.codePostal}</td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td>${clientSupprime.ville}
							<td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td>${clientSupprime.telephone}</td>
						</tr>
					</table>
				</fieldset>
			</form>
			<a href="ListerClients">Retour au menu de gestion des clients</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
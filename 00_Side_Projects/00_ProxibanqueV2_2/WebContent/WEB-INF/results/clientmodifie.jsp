<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Proxibanque - client modifié</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Modification du client : ${clientModifie.nom}
			${clientModifie.prenom}</h3>
	</div>

	<p>Rappel des informations du client modifié :</p>

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
							<td>Nom :</td>
							<td>${clientModifie.nom}</td>
						</tr>
						<tr>
							<td>Prenom :</td>
							<td>${clientModifie.prenom}</td>
						</tr>
						<tr>
							<td>Adresse :</td>
							<td>${clientModifie.adresse}</td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td>${clientModifie.codePostal}</td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td>${clientModifie.ville}
							<td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td>${clientModifie.telephone}</td>
						</tr>
					</table>
				</fieldset>
			</form>
			<a href="gestionclient.jsp?idClient=${param['idClient']}">Retour au menu précédent</a><br>
			<a href="ListerClients">Retour à la liste des clients</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Proxibanque : modification d'un client</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Mise à jour des données du client</h3>
		<p />
	</div>
	<div id="content">
		<div class="column1">
			<img alt="" src="client-update.jpg" />
		</div>
		<div class="column2">
			<form action="ModifierClient?idClient=${client.idClient}"
				method="post">
				<fieldset>
					<legend><b>Infos client</b></legend>
					<table>
						<tr>
							<td>Nom :</td>
							<td><input type="text" name="nom" value="${client.nom}"></td>
						</tr>
						<tr>
							<td>Prénom :</td>
							<td><input type="text" name="prenom" value="${client.prenom}"></td>
						</tr>
						<tr>
							<td>Adresse :</td>
							<td><input type="text" name="adresse" value="${client.adresse}"></td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td><input type="text" name="codePostal"
								value="${client.codePostal}"></td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td><input type="text" name="ville" value="${client.ville}"></td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td><input type="text" name="telephone"
								value="${client.telephone}">
							<td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Envoyer" /> <input
								type="reset" value="Reset" /></td>
						</tr>
					</table>
				</fieldset>
			</form>
			<a href="gestionclient.jsp?idClient=${param['idClient']}">Retour au menu précédent</a><br>
			<a href="ListerClients"> Retour à la liste des clients</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
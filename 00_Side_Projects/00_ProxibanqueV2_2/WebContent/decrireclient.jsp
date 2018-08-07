<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Données relatives au client</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Informations relatives au client ${client.prenom} ${client.nom}</h3>
	</div>
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
							<td>${client.idClient}</td>
						</tr>
						<tr>
							<td>Nom :</td>
							<td>${client.nom}</td>
						</tr>
						<tr>
							<td>Prenom :</td>
							<td>${client.prenom}</td>
						</tr>
						<tr>
							<td>Adresse :</td>
							<td>${client.adresse}</td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td>${client.codePostal}</td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td>${client.ville}
							<td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td>${client.telephone}</td>
						</tr>
					</table>
				</fieldset>
			</form>
			<br>
			<form>
				<fieldset>
					<legend>
						<b>Compte courant</b>
					</legend>
					<table>
						<tr>
							<td>Numéro de compte :</td>
							<td>${compteCourant.numeroCompte}</td>
						</tr>
						<tr>
							<td>Solde :</td>
							<td>${compteCourant.solde}</td>
						</tr>
						<tr>
							<td>Date d'ouverture :</td>
							<td>${compteCourant.dateOuverture}</td>
						</tr>
					</table>
				</fieldset>
			</form>
			<br>
			<form>
				<fieldset>
					<legend>
						<b>Compte épargne</b>
					</legend>
					<table>
						<tr>
							<td>Numéro de compte :</td>
							<td>${compteEpargne.numeroCompte}</td>
						</tr>
						<tr>
							<td>Solde :</td>
							<td>${compteEpargne.solde}</td>
						</tr>
						<tr>
							<td>Date d'ouverture :</td>
							<td>${compteEpargne.dateOuverture}</td>
						</tr>
						<tr>
							<td>Taux d'intérêt à l'ouverture :</td>
							<td>${compteEpargne.tauxRemun}%</td>
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
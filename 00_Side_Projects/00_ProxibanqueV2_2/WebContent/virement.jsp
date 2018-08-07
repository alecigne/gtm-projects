<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Proxibanque - virement</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Virement de compte à compte</h3>
	</div>
	<div id="content">
		<div class="column1">
			<img alt="" src="virement.jpg" />
		</div>
		<div class="column2">
			<form action="FaireVirementDo" method="post">

				<fieldset>
					<legend>
						<b>Choisissez un client débiteur</b>
					</legend>
					<select name="idClientSrc">
						<c:forEach items="${allClients}" var="currentClient">
							<option value="${currentClient.idClient}">
								${currentClient.idClient} ${currentClient.prenom}
								${currentClient.nom}</option>
						</c:forEach>
					</select>
				</fieldset>

				<fieldset>
					<legend>
						<b>Choisissez un client créditeur</b>
					</legend>
					<select name="idClientDest">
						<c:forEach items="${allClients}" var="currentClient">
							<option value="${currentClient.idClient}">
								${currentClient.idClient} ${currentClient.prenom}
								${currentClient.nom}</option>
						</c:forEach>
					</select>
				</fieldset>

				<fieldset>
					<legend>
						<b>Indiquez un montant</b>
					</legend>
					Montant (euros): <input type="text" name="montantVirement"
						placeholder="Montant (euros)"> <br> <br> <input
						type="submit" value="Envoyer"> <input type="reset"
						value="Reset">
				</fieldset>
			</form>
			<a href="operations.html">Retour à la liste des opérations bancaires</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
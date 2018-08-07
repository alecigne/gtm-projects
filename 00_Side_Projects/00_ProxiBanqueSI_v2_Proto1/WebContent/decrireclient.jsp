<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Etat civil</h1>
	<ul>
		<li>ID : ${client.idClient}</li>
		<li>Nom : ${client.nom}</li>
		<li>Prenom : ${client.prenom}</li>
		<li>Adresse : ${client.adresse}</li>
		<li>Code Postal : ${client.codePostal}</li>
		<li>Ville : ${client.ville}</li>
		<li>Téléphone : ${client.telephone}</li>
	</ul>
	<h1>Comptes</h1>
	<ul>
		<li>Numéro de compte : ${compte.numero}</li>
		<li>Solde : ${compte.solde}</li>
		<li>Date d'ouverture : ${compte.dateOuverture}</li>
	</ul>
</body>
</html>
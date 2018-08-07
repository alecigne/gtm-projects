<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="style.css" rel="stylesheet">
<title>ProxiBanque - erreur</title>
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Erreur lors de la réalisation du virement !</h3>
	</div>
	<div id="content">
		<div class="column1">
			<img alt="" src="erreur.gif" />
		</div>
		<div class="column2" align="center">
			La source (${param['idClientSrc']}) et la destination (${param['idClientSrc']}) sont identiques !
		</div>
			<a href="FaireVirementList">Retour au menu virements</a>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
</body>
</html>
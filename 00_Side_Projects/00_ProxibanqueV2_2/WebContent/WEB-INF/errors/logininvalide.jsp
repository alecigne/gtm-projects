<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxiBanque - erreur</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div id="header">
		<img alt="" src="banner.jpeg" />
		<h3>Login invalide !</h3>
	</div>
	<div id="content">
		<div class="column1">
			<img alt="" src="erreur.gif" />
		</div>
		<div class="column2" align="center">
			<p>
				Echec authentification conseiller : le login <b>${param['login']}</b>
				n'existe pas.<br> Veuillez vérifier votre login auprès de votre
				agence ProxiBanque.
			</p>
			<a href="login.html">Retour à la page de login</a>
		</div>
	</div>
	<div id="footer">&copy;Copyright ProxiBanque 2018</div>
	<br>
</body>
</html>
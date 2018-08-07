<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/parts/header.html"></jsp:include>
</head>
<body>
	<ul>
		<li>Identifiant conseiller : ${conseillerSession.id}</li>
		<li>Nom : ${conseillerSession.nom}</li>
		<li>Prenom : ${conseillerSession.prenom}</li>
		<li>Login : ${conseillerSession.login}</li>
	</ul>
	<jsp:include page="/WEB-INF/parts/footer.html"></jsp:include>
</body>
</html>
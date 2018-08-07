<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="AssocierCompte?idClient=<%=request.getParameter("idClient")%>">Associer un compte au client</a></li>
		<li><a href="DecrireClient?idClient=<%=request.getParameter("idClient")%>">Décrire le client</a></li>
		<li>Modifier le client</li>
		<li><a href="SupprimerClient?idClient=<%=request.getParameter("idClient")%>">Supprimer le client</a></li>
	</ul>
</body>
</html>
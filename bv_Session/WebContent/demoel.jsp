<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My session</title>
</head>
<body>
	<h2>Paramètres</h2>
	<ul>
		<li>Name: ${nom}</li>
		<li>Email: ${email}</li>
		<li>Password: ${password}</li>
		<li>Login: <c:out value="${login}"></c:out></li>
		<li>Session scope: ${sessionScope}</li>
		<li>Param: ${param}</li>
		<a href="${pageContext.request.servletContext.contextPath}">go to
			roots!</a>
	</ul>

	<h2>Objets implicites</h2>
	<ul>
		<li>Request parameter: ${param.nom}</li>
		<li>User-agent header: ${header["User-Agent"]}</li>
		<li>JSESSIONID Cookie Value: ${cookie.JSESSIONID.value}</li>
		<li>Server: ${pageContext.servletContext.serverInfo}</li>
	</ul>

	<h2>Cookies</h2>

	<c:forEach items="${cookie}" var="currentCookie">
		Cookie name: ${currentCookie.key}<br>
		Cookie object: ${currentCookie.value}<br>
		Property name: ${currentCookie.value.name}<br>
		Property value: ${currentCookie.value.value}<br>
	</c:forEach>

</body>
</html>
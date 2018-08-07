<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!--    IMPORTANT    -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>clientListPage</title>
</head>
<body>

	<h4>clientListPage.jsp</h4>
	
	<c:forEach items="${clients}" var="values">
	<tr>
			<td>id : <c:out value = "${values.id} " /></td>
			<td>| toString() : <c:out value = "${values} " /></td></br>
			
<%-- 		<td><c:out value = "${values.nom} " /></td> --%>
<%-- 		<td><c:out value = "${values.adresse} " /></td></br> --%>
	</tr>
	</c:forEach>

</body>
</html>
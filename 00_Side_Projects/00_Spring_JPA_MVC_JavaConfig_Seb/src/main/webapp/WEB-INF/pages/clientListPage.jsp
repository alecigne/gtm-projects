<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!--    IMPORTANT    -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>clientListPage</title>

	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/resources/css/starter-template.css" rel="stylesheet"/>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>
<body>



	
	<h5>clientList.jsp</h5>
	
 	<div class="container">
		<table   class="table table-striped">
			<tr> 
				<th>id</th> 
				<th>toString()</th>
			</tr>
			
			<c:forEach items="${clients}" var="values">
				<tr scope="row">
						<td><c:out value = "${values.id} " /></td>
						<td><c:out value = "${values} " /></td></br>
				</tr>
			</c:forEach>
			
		</table>
	</div>

</body>
</html>
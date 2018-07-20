<!DOCTYPE html>
<html>
<head><title>${deptInfo1.deptNum}: ${deptInfo1.deptName}</title>

</head>
<body>
<div align="center">
<h1>${deptInfo1.deptNum}: ${deptInfo1.deptName}</h1>
<p/>
<h1>Le département pour "${deptInfo1.deptNum}" est "${deptInfo1.deptName}".</h1>
</div>
<a href="Deconnect">Deconnect</a>

<br/>
<a href="${pageContext.request.servletContext.contextPath}/enter-dept-1.html">go to form</a>

</body></html>
<!DOCTYPE html>
<html>
<head><title>MVC Example 2</title>
</head>
<body>
<div align="center">
<h1>MVC 2</h1>
<p/>
<fieldset>
<legend>Trouver un dept par son num</legend>
<form action="show-departement-2">
  <input type="text" NAME="dept-num" value="${deptInfo2.deptNum}"><br/>
  <!-- Above is safe because the expression language outputs empty strings,
       not null pointer exceptions, for missing beans. -->
  <input type="submit" value="Show Abbreviation"/>
</form>
</fieldset>
</div></body></html>
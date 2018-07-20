<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<table>
	<tr>
		<th>Scoped variable</th>
		<th>Current value</th>
	</tr>
	<tr>
		<td>Page scope</td>
		<td>${scopeVarPage}</td>
	</tr>
	<tr>
		<td>Request scope</td>
		<td>${scopeVarRequest}</td>
	</tr>
	<tr>
		<td>Session scope</td>
		<td>${scopeVarSession}</td>
	</tr>
	<tr>
		<td>Application scope</td>
		<td>${scopeVarApplication}</td>
	</tr>
</table>
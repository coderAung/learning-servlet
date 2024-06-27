<%@page import="org.core.dto.view.ProfileView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<%
	var userProfile = (ProfileView) request.getAttribute("userProfile");
	%>
	<h1>Welcome to home</h1>
	<h2>${ userProfile }</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>${ userProfile.getName() }</th>
		</tr>
		<tr>
			<th>Email</th>
			<th>${ userProfile.email }</th>
		</tr>
		<tr>
			<th>Role</th>
			<th>${ userProfile.role.toString() }</th>
		</tr>
	</table>

	<form action="logout" method="post">
		<button type="submit">Logout</button>
	</form>
</body>
</html>
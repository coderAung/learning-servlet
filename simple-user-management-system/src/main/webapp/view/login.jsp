<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login First</h1>
	
	<%= request.getAttribute("message") %>
	
	<form action="login" method="post">
		<label for="email">Email</label>
		<input type="email" id="email" name="email"/>
		<br />
		<label for="password">Password</label>
		<input type="password" id="password" name="password"/>
		<br />
		<button type="submit">Login</button>
		
	</form>
	
</body>
</html>
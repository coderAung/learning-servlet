<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url var="registerUrl" value="/register"></c:url>
	<a href="${registerUrl}">Register new course</a>
	<h3>Search Courses</h3>
	<div>
		<form action="#">
			<input type="text" name="teacherName" placeholder="Enter Teacher Name" required="required">
			<button type="submit">Search Course</button>
		</form>
	</div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th>Course Id</th>
					<th>Course Name</th>
					<th>Course Period</th>
					<th>Time Start</th>
					<th>Time End</th>
					<th>Teacher Name</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>java1010</td>
					<td>Java Basics</td>
					<td>3 month</td>
					<td>2024-10-01</td>
					<td>2025-01-01</td>
					<td>Aung Aung</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
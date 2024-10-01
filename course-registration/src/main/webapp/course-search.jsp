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
		<c:url var="searchUrl" value="/search"></c:url>
		<form action="${searchUrl}">
			<input type="text" name="teacherName"
				placeholder="Enter Teacher Name" required="required">
			<button type="submit">Search Course</button>
		</form>
	</div>


	<c:if test="${not empty courseList}">
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
				
					<c:forEach items="${courseList}" var="course">
						<tr>
							<td>${course.courseId}</td>
							<td>${course.courseName}</td>
							<td>${course.period} month</td>
							<td>${course.timeStart}</td>
							<td>${course.timeEnd}</td>
							<td>${course.teacherName}</td>
						</tr>
					</c:forEach>
				
				</tbody>
			</table>
		</div>
	</c:if>

</body>
</html>
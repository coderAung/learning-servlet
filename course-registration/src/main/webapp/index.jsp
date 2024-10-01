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
	<div>
		<form action="#" method="post">
			<h2>Register New Course</h2>
			<div>
				<label>Course ID</label>
				<input type="text" name="courseId" placeholder="Enter Course Id" required="required"/>
			</div>
			<div>
				<label>Course Name</label>
				<input type="text" name="courseName" placeholder="Enter Course Name" required="required"/>
			</div>
			<div>
				<label>Course Period</label>
				<input type="number" name="period" placeholder="Enter Course Period" required="required"/>
			</div>
			<div>
				<label>Time Start</label>
				<input type="date" name="timeStart" required="required"/>
			</div>
			<div>
				<label>Teacher Name</label>
				<input type="text" name="teacherName" placeholder="Enter Teacher Name" required="required"/>
			</div>
			<div>
				<button type="submit">Register</button>
			</div>
		</form>
		
		<c:url var="searchUrl" value="/search"></c:url>
		<a href="${searchUrl}">Search Course</a>
	
	</div>
</body>
</html>
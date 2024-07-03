<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog | Home</title>

<jsp:include page="/css/bootstrap.jsp"></jsp:include>

</head>
<body class="bg-light">

	<jsp:include page="/components/navbar.jsp"></jsp:include>

	<section>
		<div class="container-fluid">
			<div class="row">

				<div class="col-9 mx-auto p-3 border bg-white shadow d-grid gap-3 overflow-auto" style="max-height: 80vh">
					<%
					for (int i = 0; i < 15; i++) {
					%>
					<div class="card">
						<div class="card-body">
							<div class="card-title">Title</div>
							<p class="card-text">lorekafke a eifkfaifjefakfeifakfjhgaejk
							</p>
						</div>
					</div>
					<%
					}
					%>

				</div>

			</div>
		</div>
	</section>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<nav>
	<div class="container-fluid border p-3 shadow bg-white mb-2">
		<div class="row justify-content-evenly align-items-center">
			<a href="#" class="navbar-brand col-auto">Blog</a>

			<form action="" class="d-flex col-auto">
				<input type="text" class="form-control"
					placeholder="Say Something..." />
				<button class="btn btn-secondary ms-3">Search</button>
			</form>

			<div class="col-4 d-flex justify-content-evenly">

				<c:url var="profileLink" value="/profile?id=${ 1 }"></c:url>
				<c:url var="createBlogLink" value="/blog"></c:url>

				<span> <a href="${ profileLink }">Profile</a>
				</span> <span> <a href="">Create Blog</a>
				</span> <span> <a href="">Register</a>
				</span> <span> <a href="">Login</a>
				</span> <span> <a href="">Logout</a>
				</span> <span> <a href="">Setting</a>
				</span>
			</div>

		</div>
	</div>
</nav>

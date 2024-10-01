package edu.ucsy.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/search", "/register"})
public class CourseController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getServletPath();
		
		if("/search".equals(path)) {
			
			getServletContext().getRequestDispatcher("/course-search.jsp").forward(req, resp);
		} else if("/register".equals(path)) {
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}
		
	}

}

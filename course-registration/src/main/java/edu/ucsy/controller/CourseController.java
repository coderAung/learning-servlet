package edu.ucsy.controller;

import java.io.IOException;
import java.util.List;

import edu.ucsy.dto.CourseRegisterForm;
import edu.ucsy.model.CourseService;
import edu.ucsy.model.entity.Course;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/search", "/register"})
public class CourseController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private CourseService service;
	
	@Override
	public void init() throws ServletException {
		service = new CourseService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getServletPath();
		
		if("/search".equals(path)) {
			String teacherName = req.getParameter("teacherName");
			
			if(null != teacherName && !"".equals(teacherName)) {
				List<Course> courseList = service.searchCourseByTeacherName(teacherName);
				req.setAttribute("courseList", courseList);
			}
			
			getServletContext().getRequestDispatcher("/course-search.jsp").forward(req, resp);
			
		} else if("/register".equals(path)) {
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String courseId = req.getParameter("courseId");
		String courseName = req.getParameter("courseName");
		String period = req.getParameter("period");
		String timeStart = req.getParameter("timeStart");
		String teacherName = req.getParameter("teacherName");
		
		CourseRegisterForm form = new CourseRegisterForm(courseId, courseName, Integer.parseInt(period), timeStart, teacherName);
		service.register(form);
		String path = getServletContext().getContextPath().concat("/register");
		resp.sendRedirect(path);
	}

}

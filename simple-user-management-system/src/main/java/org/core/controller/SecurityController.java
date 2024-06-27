package org.core.controller;

import java.io.IOException;

import org.core.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns = {
		"/login", "/logout"
		}
	, loadOnStartup = 1
)
public class SecurityController extends AbstractController {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if ("/login".equals(req.getServletPath())) {
			view(req, resp, "login");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if ("/login".equals(req.getServletPath())) {
			login(req, resp);
		} else if ("/logout".equals(req.getServletPath())) {
			logout(req, resp);
		}
	}

	private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().removeAttribute("loginUser");
		redirect(req, resp, "/login");
	}
	

	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var email = req.getParameter("email");
		var password = req.getParameter("password");
		
		var loginUser = userService.login(email, password);
		
		if (null != loginUser) {
			req.getSession().setAttribute("loginUser", loginUser);
			redirect(req, resp, "/home");
		} else {
			req.setAttribute("message", "Login Fail");
			redirect(req, resp, "/login");
		}
		
	}
	
	
	
}

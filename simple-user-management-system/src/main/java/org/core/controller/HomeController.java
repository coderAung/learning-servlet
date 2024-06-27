package org.core.controller;

import java.io.IOException;

import org.core.dto.LoginUser;
import org.core.entity.User.Role;
import org.core.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/", "/home"
})
public class HomeController extends AbstractController {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var loginUser = authenticate(req);
		
		if (null == loginUser) {
			redirect(req, resp, "/login");
		} else {
			if (loginUser.getRole() == Role.ADMIN) {
				
			} else if (loginUser.getRole() == Role.MANAGER) {
				
			} else if (loginUser.getRole() == Role.MEMBER) {
				var profileView = userService.getProfileView(loginUser.getId());
				req.setAttribute("userProfile", profileView);
			}
			view(req, resp, "home");
		}
	}


	private LoginUser authenticate(HttpServletRequest req) {
		
		var loginUser = (LoginUser) req.getSession().getAttribute("loginUser");
		
		return loginUser;
	}

}

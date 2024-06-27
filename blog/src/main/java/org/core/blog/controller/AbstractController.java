package org.core.blog.controller;

import java.io.IOException;

import org.apache.tomcat.jdbc.pool.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class AbstractController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
	protected DataSource dataSource;

    protected void view(HttpServletRequest request, HttpServletResponse response, String logicalViewName) throws ServletException, IOException {
    	getServletContext()
    	.getRequestDispatcher("/pages/%s.jsp".formatted(logicalViewName))
    	.forward(request, response);
    }

    protected void redirect(HttpServletRequest request, HttpServletResponse response, String path) {
    }

}
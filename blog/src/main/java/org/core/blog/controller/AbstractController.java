package org.core.blog.controller;

import org.apache.tomcat.jdbc.pool.DataSource;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class AbstractController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
	protected DataSource dataSource;

    protected void view(HttpServletRequest request, HttpServletResponse response, String logicalViewName) {
    }

    protected void redirect(HttpServletRequest request, HttpServletResponse response, String path) {
    }

}
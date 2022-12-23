package org.Learn_java.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/site")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		
		switch (page) {
		case "home":
			homepage(request, response);
			break;
		default:
			error(request, response);
			break;
		}
	}

	public void homepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "home");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
	
	public void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Error");
		request.getRequestDispatcher("error.jsp").forward(request, response);
		
	}
}

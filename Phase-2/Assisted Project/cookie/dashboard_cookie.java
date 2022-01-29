package com.HarniK.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dashboard_cookie
 */
@WebServlet("/dashboard_cookie")
public class dashboard_cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Cookie[] cookies = request.getCookies();
		PrintWriter out = response.getWriter();
		boolean found = false;

		if (cookies != null) {

			for (Cookie cookie : cookies) {

				if (cookie.getName().equals("userId")) {
					out.println("Welcome : " + cookie.getValue());
					found = true;
					break;
				}

			}

		}

		if (!found) {
			out.println("No userId found in cookie <br/>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

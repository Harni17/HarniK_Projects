package com.HarniK.ValidateLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

//		Check whether the session already exists
		if (session.getAttribute("userName") != null) {

			out.println("<h3>Welcome " + session.getAttribute("userName"));

			out.println("<br> You are now logged in!!</h3>");

			out.println("<br><p><h4><a href='logout'>LOGOUT</a></h4>");
		}
		else {
			response.sendRedirect("login_validate.html");
		}

	}

}

package com.HarniK.ValidateLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User_Logout
 */
@WebServlet("/logout")
public class User_Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
//		Invalidate the session here
		request.getSession().invalidate();
		
		out.println("<h2>You are logged out!<br><br>");
		
		out.println("<br><br><a href='login_validate.html'>Login again</a>");
	}

}

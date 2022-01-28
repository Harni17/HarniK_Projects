package Proj1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class postRequest
 */
@WebServlet("/postRequest")
public class postRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
    response.setContentType("text/html");
    out.print("<hr>");
    out.print("<h3>Welcome to Post Page</h3>");
    out.print("<hr>");
    
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    
    out.println("Your Enterd Name is " + name + "<br> Your Paswword is " + password);
    out.print("<hr>");
}

}

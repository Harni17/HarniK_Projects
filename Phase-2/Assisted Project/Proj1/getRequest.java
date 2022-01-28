package Proj1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class getRequest
 */
@WebServlet("/getRequest")
public class getRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<hr>");
        out.print("<h3>Welcome to Get Page</h3>");
		out.print("<hr>");
		
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        
        out.println("Your Name is " + name + "<br>Your Address is " + address);
		out.print("<hr>");

	}

}

package com.HarniK;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBC_Setup
 */
@WebServlet("/JDBC_Setup")
public class JDBC_Setup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public JDBC_Setup() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/main/webapp/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           out.println("DB Connection initialized.<br>");
           
           conn.closeConnection();
           out.println("DB Connection closed.<br>");
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException |SQLException e) {
           e.printStackTrace();
   }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

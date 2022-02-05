package com.StoredProcedure.HarniK;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.CallableStatement;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet(name = "ProductDetail", urlPatterns = { "/ProductDetail" })
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
           stmt.setString(1, "new product");
           stmt.setBigDecimal(2, new BigDecimal(1700.90));
           stmt.executeUpdate();
           
           out.println("Stored procedure has been executed.<Br>");
           stmt.close();
           
           
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

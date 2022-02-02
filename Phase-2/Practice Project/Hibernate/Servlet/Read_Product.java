package com.HarniK.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Harni.Entity.Ecom_Product;
import com.HarniK.Util.HibernateUtil;

/**
 * Servlet implementation class Read_Product
 */
@WebServlet("/read_Product")
public class Read_Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Read_Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		Session session = sf.openSession();
		
		List<Ecom_Product> products = session.createQuery(" from Ecom_Product").list();
		
		
		
		out.print("<h1> Product List :- </h1>");
		out.print("<style> table,td,th { border:2px solid red; padding: 10px; }</style>" );
		out.print("<table>");
		out.print("<tr>");
		out.print("<th> Product Id </th>");
		out.print("<th> Product Name </th>");
		out.print("<th> Product Price </th>");
		out.print("</tr>");
		
		for(Ecom_Product p : products) {
			
			out.print("<tr>");
			out.print("<td>"+p.getId()+"</td>");
			out.print("<td>"+p.getName()+"</td>");
			out.print("<td>"+p.getPrice()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

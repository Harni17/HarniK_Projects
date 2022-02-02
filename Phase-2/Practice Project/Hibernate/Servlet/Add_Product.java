package com.HarniK.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Harni.Entity.Ecom_Product;
import com.HarniK.Util.HibernateUtil;

@WebServlet("/add_Product")
public class Add_Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Add_Product() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("add_product.html").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		String productName = request.getParameter("name");
		String productPrice = request.getParameter("price");
		
		//Step1: Gets session Factory
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		//Step 2: Gets Session object
		Session session = sf.openSession();
		
		//Step3: Gets Tx object and begin transaction
		Transaction tx =  session.beginTransaction();
		
		// Step 4: Create and populate entity object
		Ecom_Product product = new Ecom_Product();
		product.setName(productName);
		product.setPrice(Double.parseDouble(productPrice));
		
		session.save(product);
		
		tx.commit();
		
		out.print("<h3> Product is created successfully ! <h3>");
		session.close();
	}

	}


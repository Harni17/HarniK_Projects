package com.HarniK.servletInterface;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class Servlet_Interface
 */
@WebServlet("/servlet_Interface")
public class Servlet_Interface implements Servlet{
	private static final long serialVersionUID = 1L;

	ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        
        System.out.println("Initialization complete");
     }

     public void service(ServletRequest req,ServletResponse res)
     throws IOException,ServletException{
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
         out.print("In the service() method<br>");
     }
     
     public void destroy(){
         System.out.println("In destroy() method");
     }
     
     public ServletConfig getServletConfig(){
         return config;
     }
     
     public String getServletInfo(){
         return "This is a sample servlet info";
     }

}

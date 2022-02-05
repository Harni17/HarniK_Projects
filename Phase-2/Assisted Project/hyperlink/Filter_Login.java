package com.HarniK.hyperlink;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class Filter_Login
 */
@WebFilter("/filter_Login")
public class Filter_Login implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Filter_Login() {
        super();
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String userId = request.getParameter("userid");

        if( userId != null){
        	chain.doFilter(request, response);
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

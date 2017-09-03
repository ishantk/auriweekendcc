package com.auribises.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println("--Filter destroy--");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// PreProcessing
		out.println("--Filter PreProcessing--<br/>");
		
		String email = request.getParameter("txtEmail");
		String pass = request.getParameter("txtPassword");
		
		if(email.isEmpty() && pass.isEmpty()){
			out.println("Your Request Cannot be Proceesd...");
		}else{
			// pass the request along the filter chain
			// it shall forward the request to the connected Servlet
			chain.doFilter(request, response);

			
			//PostProcessing
			out.println("--Filter PostProcessing--<br/>");
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--Filter init--");
	}

}

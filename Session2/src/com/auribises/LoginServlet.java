package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		boolean flag = helper.loginUser(user);
		
		if(flag){
			
			String name = "John Watson";
			int age = 20;
			
			// Session Tracking
			
			//1. Cookies
			/*Cookie c1 = new Cookie("keyName", name);
			Cookie c2 = new Cookie("keyAge", String.valueOf(age));
			
			//c1.setMaxAge(1000);
			
			response.addCookie(c1);
			response.addCookie(c2);*/
			
			
			//2. URL ReWriting
			String url = "Welcome?keyname="+name+"&keyage="+age;
			out.println("<h4>Login is Success</h4><br/>");
			//out.println("<a href='Welcome'>Enter Home</a><br/>");
			out.println("<a href='"+url+"'>Enter Home</a><br/>");
		}else{
			out.println("Login is Failure");
		}
		
		helper.closeConnection();
	}

}

package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Write the response back to Client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Reading the data from Request by Client
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");		
		
		// DB Operation
		if(email.equals("admin@example.com") && password.equals("password123")){
			out.println("<b>Login is Success<b>");
			
			// This data shall be extracted from DB
			String name = "John Watson";
			int age = 30;
			
			//1. Cookies -> HashMap (Key-Value Pair)
			//Are stored on Client's Machine in the browser
			/*Cookie c1 = new Cookie("keyName", name);
			Cookie c2 = new Cookie("keyAge", String.valueOf(age));
			
			//c1.setMaxAge();
			
			// Store the Cookies in Browser
			response.addCookie(c1);
			response.addCookie(c2);*/
			//out.println("<a href='Welcome'>Enter Home</a>");
			
			//2. URL ReWriting / QueryString
			//out.println("<a href='Welcome?name="+name+"&age="+age+"'>Enter Home</a>");
			
			//3. Hidden Form Field
			/*out.print("<form action='Welcome' method='post'>");
			out.print("<input type='hidden' value='"+name+"' name='txtName'/>");
			out.print("<input type='hidden' value='"+age+"' name='txtAge'/>");
			out.print("<input type='submit' value='Enter Home'/>");
			out.print("</form>");*/
			
			//4. HttpSession
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);	
			session.setAttribute("keyAge", String.valueOf(age));	
			out.println("<a href='Welcome'>Enter Home</a>");
			
		}else{
			out.println("<i>Login is Failure<i>");
		}
	}

}

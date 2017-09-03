package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Write the response back to Client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Send Back the Response
		out.println("Welcome Admin, Its: "+new Date()+"<br/>");
		
		// Read the Cookies
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		//String name = request.getParameter("txtName");
		//String age = request.getParameter("txtAge");
		
		/*HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String age = (String)session.getAttribute("keyAge");
		
		out.print(name+" - "+age);*/
		
	}

}

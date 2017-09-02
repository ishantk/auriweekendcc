package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegisterServlet", "/Register", "/Awesome" })
public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Write the response back to Client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Reading the data from Request by Client
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Password is: "+password);
		
		// JDBC Code to Save the user in DB
		// Skipping
		
	}

}

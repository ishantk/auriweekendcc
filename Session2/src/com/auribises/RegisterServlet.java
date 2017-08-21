package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/RegisterServlet", "/Register", "/Signup" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("--Servlet init executed--");
	}

	public void destroy() {
		System.out.println("--Servlet destroy executed--");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--Servlet service executed--");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Extracting the data from Client's Request
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Password: "+password);
		
		//User user = new User(name,email,password);
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		if(i>0){
			out.println("<b>User Registered<b>");
		}else{
			out.println("User not Registered");
		}
		helper.closeConnection();
		
	}

}

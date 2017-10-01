<%@page import="com.auribises.db.HibernateHelper"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.auribises.db.JDBCHelper" %>
<%@ include file="printdate.jsp" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>

	<%
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		// Data should be Saved in DataBase - Hibernate
		User user = new User(null,name,email,password);
		
		/* Configuration conf = null;
		SessionFactory factory = null;
		Session ssn = null;
		Transaction txn = null;
		
		try{
			
			conf = new Configuration();
			conf.configure();
			
			factory = conf.buildSessionFactory();
			
			ssn = factory.openSession();
			
			txn = ssn.beginTransaction();
			
			ssn.save(user);
			
			txn.commit();
			
			out.print("User Registered Successfully..");
			//response.sendRedirect();
			
			
		}catch(Exception e){
			e.printStackTrace();
			txn.rollback();
		}finally{
			ssn.close();
			factory.close();
		} */
		
		HibernateHelper helper = new HibernateHelper();
		helper.saveObject(user);
		helper.closeConnection();
		
		
		//if(email.equals("admin@example.com") && password.equals("password123")){
	%>		
	<%-- 	<b><i>Welcome to LMS</i></b>
	<%		
		}else{
			//out.print("<b><i>Sorry! Try Again!!</i></b>");
			response.sendRedirect("https://www.google.co.in");
			//response.addCookie();
		}
	%> --%>
	
</body>
</html>
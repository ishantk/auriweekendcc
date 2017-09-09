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
		
		// Ideally Data should be Saved in DataBase
		
		if(email.equals("admin@example.com") && password.equals("password123")){
	%>		
		<b><i>Welcome to LMS</i></b>
	<%		
		}else{
			//out.print("<b><i>Sorry! Try Again!!</i></b>");
			response.sendRedirect("https://www.google.co.in");
			//response.addCookie();
		}
	%>
	
</body>
</html>
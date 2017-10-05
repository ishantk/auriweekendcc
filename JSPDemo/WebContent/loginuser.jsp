<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		// Ideally check it from DB
		if(email.equals("admin@example.com") && password.equals("password123")){
			
			String name = "John Watson";
			int age = 30;
			
			/*Cookie c1 = new Cookie("keyName",name);
			Cookie c2 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(c1);
			response.addCookie(c2);*/
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			
			//out.print("<a href='welcome.jsp'>Enter Home</a>");
			response.sendRedirect("welcome.jsp");
		}else{
			//out.print("Login Failed...");
		%>
			<b>Login Failed...</b>
		<%
		}
	
	%>


</body>
</html>
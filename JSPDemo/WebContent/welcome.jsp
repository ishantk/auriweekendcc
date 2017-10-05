<%@page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="printdate.jsp" %>     --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>Welcome Admin !!</b>
	<br/>
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			if(ck.getName().equals("keyName")){
				out.print(ck.getValue()+" Please choose Options...");
				break;
			}
			//out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		out.print(session.getAttribute("keyName")+"<br/>");
		out.print(session.getAttribute("keyAge"));
	%>
	
	<jsp:include page="printdate.jsp"/>
	
	<%-- <%
		User user = new User();
		user.setId(101);
		user.setName("John");
		
		out.print(user.getName());
	%> --%>
	
	<jsp:useBean id="uRef" class="com.auribises.model.User"/>
	
	<jsp:setProperty property="id" name="uRef" value="101"/>
	<jsp:setProperty property="name" name="uRef" value="Jennie"/>
	<jsp:setProperty property="email" name="uRef" value="jennie@example.com"/>
	<jsp:setProperty property="password" name="uRef" value="jennie123"/>
	<br/>
	Name is: <jsp:getProperty property="name" name="uRef"/>
	
	<%-- <jsp:forward page="errorpage.jsp"/> --%>
	
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page errorPage="errorpage.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	This is HTML
	<br/>
	<h4>SriptLet</h4>
	<% 
		int num = 5;
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
		
		out.print("pi is: "+pi);
	%>
	
	
	<% 
		int age = 20;
		if(age>18){
			
	%>		
		<b>You Can Vote</b>
	
	<% 
		}else{
	%>		
			<b>You Cannot Vote</b>
	<%			
		}
	%>
	
	<h4>Declarative</h4>
	<br/>
	
	<%! 
		float pi = 3.14f;
		
		int squareOfNum(int n){
			return n*n;
		}
	
	%>
	
	Square of 5 is: <% out.print(squareOfNum(5));%>
	
	<h4>Expression</h4>
	<br/>
	
	Square of 7 is: <%= squareOfNum(7) %>
	
	<%
		int[] arr= {10,20,30,40,50};
		out.print(arr[5]);
		/*try{
			out.print(arr[5]);
		}catch(Exception e){
			out.print(e);
		}*/
	%>
	
</body>
</html>
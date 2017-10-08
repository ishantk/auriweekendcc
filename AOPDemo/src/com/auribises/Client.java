package com.auribises;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student sRef = context.getBean("stuProxy",Student.class);
		
		//int roll = sRef.getRoll();
		//String name = sRef.getName();
		
		sRef.registerStudent(101, "Jack"); // Execution of Business
		
		sRef.fun(100);
 	}

}

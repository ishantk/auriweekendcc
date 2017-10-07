package com.auribises;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Way
//		Employee emp = new Employee();
//		emp.setEid(101);
//		emp.setName("John");
//		emp.setEmail("john@example.com");
//		emp.setAge(30);
//		emp.setAddress("Redwood Shores");
//
//		System.out.println("Employee is: "+emp);
		
		// IOC | Inversion Of Control
		// You dont create the objects. 
		// Spring FW will create the Objects and we get only reference to the Object
		
		// IOC Container
		// 1. BeanFactory
		// 2. ApplicationContext 
		// IOC Container will read an XML File. (Parse XML File)
		// XML File shall contain the configuration of your Object
		
		// Steps
		// 1. Link the Spring Core Jars
		// 2. Configure the XML File
		// 3. Obtain the reference of Object from IOC Container
		
		// 3.1 BeanFactory - IOC
//		Resource resource = new ClassPathResource("employeebean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
//		Employee eRef1 = (Employee)factory.getBean("emp1");
//		Employee eRef2 = factory.getBean("emp2",Employee.class);
//		
//		System.out.println(eRef1);
//		System.out.println(eRef2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
//		Employee eRef1 = (Employee)context.getBean("emp1");
//		Employee eRef2 = context.getBean("emp2",Employee.class);
//		
//		System.out.println(eRef1);
//		System.out.println(eRef2);
		
//		Employee eRef1 = (Employee)context.getBean("emp1");
//		Employee eRef2 = (Employee)context.getBean("emp1");
//		
//		System.out.println(eRef1);
//		System.out.println(eRef2);
		
		//Address aRef = context.getBean("adrs",Address.class);
		//System.out.println(aRef);
		
//		Person pRef = context.getBean("pers",Person.class);
//		System.out.println(pRef);
		
		Son sRef = context.getBean("sRef",Son.class);
		System.out.println(sRef);
		//System.out.println(sRef.getFname()+" - "+sRef.getLname());
		
		ClassPathXmlApplicationContext cxt = ( ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}

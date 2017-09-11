package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("John");
		emp1.setEmail("john@example.com");
		emp1.setAddress("Country Homes North");
		emp1.setSalary(50000);
		
		Employee emp2 = new Employee();
		emp2.setName("Jennie");
		emp2.setEmail("jennie@example.com");
		emp2.setAddress("Country Homes East");
		emp2.setSalary(60000);
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Read the hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(emp1);
			session.save(emp2);
			
			transaction.commit();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			transaction.rollback();
		}finally{
			session.close();
		}

	}

}

package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("John Watson");
		pRef.setPhone("+91 99999 99999");
		pRef.setEmail("john@example.com");
		pRef.setAge(30);
		
		Address aRef = new Address();
		aRef.setAdrsLine("HNO# 33");
		aRef.setCity("Ludhiana");
		aRef.setState("Punjab");
		aRef.setZipCode(141002);
		
		pRef.setAddress(aRef);
		aRef.setPerson(pRef);

		
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
			
			// Code To perform DB Operation
			session.save(pRef);
			
			transaction.commit();
			
			System.out.println("Transaction Finished...");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			transaction.rollback();
		}finally{
			session.close();
		}
		

	}

}

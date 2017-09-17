package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceClient {

	public static void main(String[] args) {
		
		Product pRef = new Product();
		pRef.setPrice(10000);
		
		Electronics eRef = new Electronics();
		eRef.setPrice(20000);
		eRef.setScreen(5);
		
		Mobile mRef = new Mobile();
		mRef.setPrice(50000);
		mRef.setScreen(5);
		mRef.setName("iPhone");
		
		
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
			session.save(eRef);
			session.save(mRef);
			
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

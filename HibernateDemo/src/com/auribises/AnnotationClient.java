package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AnnotationClient {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("John");
		s1.setAddress("Country Homes");
		s1.setAge(20);
		s1.setStd(12);
		
		Student s2 = new Student();
		s2.setName("Jennie");
		s2.setAddress("Country Homes");
		s2.setAge(19);
		s2.setStd(12);
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(s1);
			session.save(s2);
			
			transaction.commit();
			
			System.out.println("Transaction Finishesd...");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}

	}

}

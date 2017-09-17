package com.auribises;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		
		Manager mRef1 = new Manager(null,"John",50000,null);
		
		Manager mRef2 = new Manager();
		mRef2.setName("Jennie");
		mRef2.setSalary(70000);
		
		Certificate c1 = new Certificate();
		c1.setName("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setName("AWS");
		
		//Certificate c3 = new Certificate();
		//c3.setName("CCNA");
		
		List<Certificate> cList = new ArrayList<>(); // RTP
		cList.add(c1); //0
		cList.add(c2); //1
		//cList.add(c3); //2
		
		mRef2.setCertiList(cList);
		
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
			session.save(mRef2);
			
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

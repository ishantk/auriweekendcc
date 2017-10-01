package com.auribises.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateHelper {
	
	Configuration conf = null;
	SessionFactory factory = null;
	Session ssn = null;
	Transaction txn = null;
	
	public HibernateHelper(){
		try{
			
			conf = new Configuration();
			conf.configure();
			
			factory = conf.buildSessionFactory();
			
			ssn = factory.openSession();
			
			txn = ssn.beginTransaction();
			
			System.out.println("Hibernate Init...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void saveObject(Object o){
		try {
			
			ssn.save(o);
			txn.commit();
			
			System.out.println("Hibernate Transaction Done...");
			
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		}
	}
	
	public void closeConnection(){
		try{
			
			ssn.close();
			factory.close();
			
			System.out.println("Hibernate Connection Closed...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

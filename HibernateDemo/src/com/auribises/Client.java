package com.auribises;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Jack");
		emp1.setEmail("jack@example.com");
		emp1.setAddress("Country Homes East");
		emp1.setSalary(55000);
		
		Employee emp2 = new Employee();
		emp2.setName("Jim");
		emp2.setEmail("jim@example.com");
		emp2.setAddress("Country Homes West");
		emp2.setSalary(67000);
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			//config.configure("anyname.xml"); // if hibernate.cfg.xml file is renamed as anyname.xml
			config.configure(); // Read the hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			// Insert Operation
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Selected Operation
			//Employee e = (Employee)session.get(Employee.class, 3);
			//System.out.println("e is: "+e);
			
			// For Update Operation, Retrieve First and then update
			//Employee e = new Employee();
			//e.setId(3);
			
			// Update Operation
			//e.setName("Jack Johnson");
			//e.setSalary(77000);
			
			//session.update(e);
			
			//System.out.println("e is: "+e);
			
			// Delete Operation
			//session.delete(e);
			
			// Retrieve All
			// 1. HQL (Hibernate Query Language)
			/*String hql = "From Employee where salary > 55000";
			
			List<Employee> empList = session.createQuery(hql).list();
			
			for(Employee e : empList){
				System.out.println(e);
				System.out.println("-----------------------------------------------");
			}*/
			
			//2. Criteria
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 55000));
			
			List<Employee> empList = criteria.list();
			
			for(Employee e : empList){
				System.out.println(e);
				System.out.println("-----------------------------------------------");
			}
			
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

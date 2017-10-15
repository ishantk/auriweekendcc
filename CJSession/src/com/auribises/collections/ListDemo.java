package com.auribises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	
}

public class ListDemo {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList list1 = new ArrayList(); // Raw Type
		ArrayList<String> list2 = new ArrayList<String>(); // Generic Type
		ArrayList<Employee> list3 = new ArrayList<Employee>(); // Generic Type
		List<String> list4 = new ArrayList<String>(); //Polymorphic Statement
		
		
		Employee e = new Employee();
		
		// Add data
		//list1.add(0,100);	//0
		list1.add(100);	//0
		list1.add("Hello");
		list1.add('A');
		list1.add(2.2f); //n-1
		list1.add(e);
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jack");
		list2.add("Jim");
		list2.add("Joe");
		//list2.add(e); -> err
		//list2.add(100); -> err
		
		list3.add(e);
		//list3.add("Hello"); -> err
		
		// Size of List
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		// See the data in list
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		
		// Remove Element from list
		//list2.remove(2);
		//System.out.println(list2);

		// update the element
		list2.set(2, "Jack Watson");
		
		// Get the element from list
		String name = list2.get(2);
		System.out.println("name is: "+name);

		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		// Add one list to other
		//list2.addAll(list1);
		
		
		// Iterate in the List
		//1. For Loop
		System.out.println("--------For Loop-------");
		for(int i=0;i<list2.size();i++){
			//String n = list2.get(i);
			//System.out.println(n);
			System.out.println(list2.get(i));
		}
		
		//2. Enhanced For Loop
		System.out.println("--------Enhanced For Loop-------");
		for(String n : list2){
			System.out.println(n);
		}
		
		for(Object o : list1){
			System.out.println(o);
		}
		
		//3. Iterator
		System.out.println("--------Iterator-------");
		Iterator<String> itr = list2.iterator();
		Iterator<Employee> itr2 = list3.iterator();
		while(itr.hasNext()){
			String n = itr.next();
			System.out.println(n);
			
			//if(n.equals("John")){
			//	itr.remove();
			//}
		}
		
		//4. ListIterator
		System.out.println("--------List Iterator-------");
		ListIterator<String> itr1 = list2.listIterator();
		while(itr1.hasNext()){
			String n = itr1.next();
			System.out.println(n);
		}
		
		while(itr1.hasPrevious()){
			String n = itr1.previous();
			System.out.println(n);
		}
		
		//5. Enumeration
		System.out.println("--------Enumeration-------");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String n = enm.nextElement();
			System.out.println(n);
		}
		
		
		// THREAD-SAFE
		Vector<String> names = new Vector<String>();
		names.add("John"); // 0
		names.add("Jim");
		names.add("Joe"); // 2
		
	}

}

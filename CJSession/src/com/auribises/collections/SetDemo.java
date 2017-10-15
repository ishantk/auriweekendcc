package com.auribises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("John");
		nameList.add("Shawn");
		nameList.add("John");
		nameList.add("Jennie");
		nameList.add("John");
		nameList.add("Fionna");
		
		System.out.println(nameList);
		
		//HashSet<String> set = new HashSet<String>(); // Generic
		TreeSet<String> set = new TreeSet<String>(); // Generic
		Set<String> set1 = new HashSet<String>(); // Polymorphic
		
		set.add("John");
		set.add("Shawn");
		set.add("Jennie");
		set.add("John");
		set.add("Jack");
		set.add("Fionna");
		
		System.out.println(set);
		
		//set.remove("Jack");
		//if(set.contains("Jack"))
		
		
		// Iterator
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		Enumeration<String> enm = Collections.enumeration(set);

		Collections.sort(nameList); // Sorting of List
		System.out.println(nameList);
		
	}

}

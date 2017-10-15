package com.auribises.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		//HashMap map = new HashMap();

		
		map.put(101, "John");
		map.put(121, "Jennie");
		map.put(79, "Jim");
		map.put(33, "Jack");
		
		System.out.println(map);
		
		//map.remove(101);
		
		String nm = map.get(121);
		//System.out.println(nm);
		
		//if(map.containsKey(101))
		//if(map.containsValue("John"))
		
		map.put(101, "John Watson");
		map.put(1110, "John Watson");
		map.put(1111, null);
		map.put(null, "Value");
		
		System.out.println(map);
		
		// Iterate
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String val = map.get(key);
			System.out.println(key+" - "+val);
		}
		
		// THREAD-SAFE | No Null key and No Null Value
		Hashtable<Integer, String> table = new Hashtable<Integer, String>(); 
		
		
	}

}

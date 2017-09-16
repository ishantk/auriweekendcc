package com.auribises.operators;

public class ShiftOperatorDemo {

	
	/*
	 * 1 0 0 0 >> 2
	 * 0 0 1 0 
	 * 0 0 0 1
	 * 
	 * 0 0 0 0 1 0 0 0 << 2
	 * 0 0 1 0 0 0 0 0
	 * 
	 * 11
	 * 
	 * 0 0 0 0 1 0 1 1 >> 2
	 * 0 0 0 0 0 0 1 0 -> 2
	 * 
	 * 1 0 1 1
	 * 0 1 0 0
	 *       1
	 *       
	 * 0 1 0 1 -> -11
	 * 
	 * 1 1 0 1
	 * 
	 * 0 0 1 0
	 *       1 
	 *  
	 * 0 0 1 1 -> -3  
	 * 
	 * 1 1 0 1
	 * 
	 * 0 0 1 0
	 * 		 1
	 * 
	 * 0 0 1 1 >> 2
	 * 1 1 0 0
	 * 
	 * 0 0 1 1
	 *       1      
	 * 0 1 0 0           
	 */
	public static void main(String[] args) {
		
		//int i = 8;
		//int j = i>>2; // divide by 2pow2
		//int j = i>>3; // divide by 2pow3
		
		//int k = i<<2; // multiple by 2pow2
		
		//int i = 11;
		int i = -13;
		int j = i>>2;
		System.out.println("j is: "+j);
		//System.out.println("k is: "+k);

	}

}

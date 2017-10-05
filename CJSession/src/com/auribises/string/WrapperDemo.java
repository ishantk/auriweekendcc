package com.auribises.string;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type
		Integer iRef = new Integer(10); // Reference Type
		
		// Wrapper Class
		Integer iRef1 = new Integer(i); // Reference Type // Boxing
		
		float f = 2.2f;
		Float fRef = new Float(f); // Boxing
		
		char ch = 'A';
		Character chRef = new Character(ch); // Boxing
		
		// AutoBoxing
		Integer iRef2 = i; // -> Integer iRef2 = new Integer(i);
		
		int k = iRef.intValue(); // UnBoxing
		char c = chRef.charValue(); // UnBoxing
		
		float f1 = fRef; // AutoUnBoxing

	}

}

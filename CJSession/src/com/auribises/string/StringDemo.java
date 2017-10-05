package com.auribises.string;

public class StringDemo {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello World";
		String str2 = "Hello World";

		// Non Interned Way
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");
		
		// Reference Check
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		if(str1.equals(str3)){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}
		
		System.out.println(str1.toString());
		System.out.println(str2);
		System.out.println(str3.toString());
		System.out.println(str4);

	}

}

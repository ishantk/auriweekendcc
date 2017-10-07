package com.auribises.string;

public class StringDemo {
	
	void sayHello(CharSequence name){
		
	}

	public static void main(String[] args) {
		
		StringDemo sRef = new StringDemo();
		sRef.sayHello(new String("John"));
		sRef.sayHello(new StringBuffer("Jennie"));
		sRef.sayHello(new StringBuilder("Jack"));
		
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
		
		String str5 = "John, Jennie, Jack, Jim, Joe";
		String str6 = "Being Exceptional is thumbrule to success";
		
		String[] arr1 = str5.split(",");
		String[] arr2 = str6.split(" ");
		
		for(String str : arr1){
			System.out.println(str.trim());
		}
		
		if(str5.contains("Jennie")){
			System.out.println("Jennie is in the list");
		}
		
		str5 = "";
		if(str5.isEmpty()){
			System.out.println("str5 is empty");
		}
		
		// Strings are IMMUTABLE. They cannot be changed
		String str7 = "This is Awesome";
		String str8 = str7.toUpperCase();
		
		System.out.println("str7 is: "+str7);
		System.out.println("str8 is: "+str8);

		String str9 = str7.substring(5,7);//str7.substring(4);
		System.out.println("str9 is: "+str9);
		
		String str10 = str7.replace('s', 'p');
		System.out.println("str10 is: "+str10);
		
		char ch = str7.charAt(0);
		System.out.println(ch);
		
		char[] chArr = str7.toCharArray();
		for(char c : chArr){
			System.out.print(c+"-");
		}
		
		String str11 = new String(chArr);
		System.out.println(str11);
		
		String str12 = "Mr.";
		String str13 = "John Watson";
		//String str14 = str12+" "+str13;
		String str14 = str12.concat(" ").concat(str13);
		System.out.println("Hello, "+str14);
		
		System.out.println(str14.length());
		
		// MUTABLE STRINGS
		// 1. StringBuffer
		// 2. StringBuilder
		
		String s = new String("Hello");

		// Buffer and Builder are always Non Interned
		// Not Thread Safe
		StringBuilder bld = new StringBuilder("Hello");	
		
		// Thread Safe
		StringBuffer buf = new StringBuffer("Hello");
		
		s.concat(" Bye");
		bld.append(" Bye");
		buf.append(" Bye");
		
		System.out.println("s is: "+s);
		System.out.println("bld is: "+bld);
		System.out.println("buf is: "+buf);
		
		// Interface, Built In
		CharSequence cs; 
		
		cs = new String();
		cs = new StringBuffer();
		cs = new StringBuilder();
	}

}

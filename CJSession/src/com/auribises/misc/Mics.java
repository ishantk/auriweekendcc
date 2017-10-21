package com.auribises.misc;

class Human{
	void respiration(){
		System.out.println("Human is Breathing...");
	}
}

class Student extends Human{
	
	void respiration(){
		super.respiration();
		System.out.println("Student is Breathing...");
		
		if(super.toString().equals(this.toString())){
			System.out.println("Wow");
			
			System.out.println(super.hashCode());
			System.out.println(this.hashCode());
		}
	}
	
	Student(){
		System.out.println("super is: "+super.toString());
		System.out.println("super is: "+Student.super.toString());
		System.out.println("this is: "+this);
		System.out.println("this is: "+Student.this);
	}
}

class Outer{
	
	int o;
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nesting of Classes | Containment
	class Inner{
		int i;
		
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

class A{
	
	public class B{
		
	}
	
	static class D{
		
	}
	
	interface Inf{
		
	}
	
	static interface Inf1{
		
	}
	
	void show(){
		// Local Class
		class C{
			
		}

		// error
//		interface I{
//			
//		}
		
		C c = new C();
	}
	
	static void show1(){
		// Local Class
		class C{
			
		}
		
		C c = new C();
	}
	
	
}

class Address{
	
}

class Employee{
	Address adrs; // Has-A Relation
}

public class Mics {

	public static void main(String[] args) {
		
		//Student s1 = new Student();
		/*System.out.println("s1 is: "+s1);
		
		System.out.println("=================");
		
		Student s2 = new Student();
		System.out.println("s2 is: "+s2);*/
		
		//s1.respiration();
		
		Outer o = new Outer();
		o.show();
		
		Outer.Inner i = o.new Inner();
		i.show();
	
	}

}

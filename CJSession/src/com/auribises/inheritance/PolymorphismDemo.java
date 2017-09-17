package com.auribises.inheritance;

// Poly -> many | morphism -> forms
// Compile Time | Static Binding | Early Binding
/*
 * Method Overloading
 * Constructor Overloading
 * 	
 * User the same name with different inputs
 * Rules:
 * 	1. Method Name should be same
 *  2. Input should be Unique/Different
 *  		2.1 Number of Inputs
 *  		2.2 Type of Inputs
 *  		2.3 Sequence of Inputs
 * 	3. Return Type has no significance
 * 
 * 	
 * 
 */



// Run Time | Dynamic Binding | Late Binding

class MyMaths{
	
	MyMaths(){
		
	}
	
	MyMaths(int a){
		
	}
	

	MyMaths(int a, int b){
		
	}
	
	void area(int side){
		int a = side*side;
		System.out.println("Area of Square is: "+a);
	}

	
	void area(float radius){
		float a = 3.14f * radius * radius;
		System.out.println("Area of Circle is: "+a);
	}
	
	void area(int w, int h){
		int a = w*h;
		System.out.println("Area of Rectangle is: "+a);
	}
	
	void area(int w, float h){
		float a = w*h;
		System.out.println("Area of Rectangle is: "+a);
	}
	
	void area(float w, int h){
		float a = w*h;
		System.out.println("Area of Rectangle is: "+a);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		MyMaths m = new MyMaths();
		m.area(10);	
		m.area(2.2f);
		m.area(10,20);

	}

}

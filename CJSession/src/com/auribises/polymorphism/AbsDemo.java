package com.auribises.polymorphism;

class Parent{
	Parent(){
		System.out.println("Parent Created...");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Created...");
	}
}

/*class Shape{
	
	Shape(){
		System.out.println("Shape Created");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Created");
	}
	abstract void draw();
}*/

interface Shape{
	
	// error
	/*Shape(){
		System.out.println("Shape Created");
	}*/
	
	void draw(); // public abstract void draw();
}

class Rectangle implements Shape{//extends Shape{ // Rectangle IS-A Shape
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Circle implements Shape{//extends Shape{ // Circle IS-A Shape
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}


class Polygon implements Shape{//extends Shape{ // Polygon IS-A Shape
	public void draw(){
		System.out.println("Drawing a Polygon");
	}
}



public class AbsDemo {

	public static void main(String[] args) {
		
		/*Shape sRef;
		sRef = new Shape();
		sRef.draw();
		
		Rectangle rRef;
		rRef = new Rectangle();
		rRef.draw();*/
		
		Shape sRef;
	
		sRef = new Rectangle(); // Polymorphic Statement
		sRef.draw();
		
		sRef = new Circle();
		sRef.draw();
		
		sRef = new Polygon();
		sRef.draw();
	
		// Senseless
//		sRef = new Shape();
//		sRef.draw();
		

		//System.out.println("============");
		//Child ch = new Child();
		
	}

}

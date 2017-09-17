package com.auribises.inheritance;

class Parent{
	void purchaseBike(){
		System.out.println("Lets purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets purchase Maruti");
	}
}

class Child extends Parent{
	public void purchaseBike(){
		System.out.println("Lets purchase Royal Enfield");
	}
	
	static void purchaseCar(){
		System.out.println("Lets purchase Honda");
	}
	
}


public class OverridingDemo {

	public static void main(String[] args) {

		Child cRef = new Child();
		cRef.purchaseBike();
		
		Child.purchaseCar();
			
	}

}

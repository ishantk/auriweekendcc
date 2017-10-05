package com.auribises.interfaces;

interface Inf{
	void show();
	void fun(); // public  abstract void fun();
}

class InfImpl implements Inf{

	public void show() {
		System.out.println("This is Show");
	}

	public void fun() {
		System.out.println("This is fun");
	}
	
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		Inf iRef = new InfImpl();
		iRef.show();
		iRef.fun();
		
		
		// Anonymous Class
		Inf iRef1 = new Inf(){
			public void show() {
				System.out.println("This is Show");
			}

			public void fun() {
				System.out.println("This is fun");
			}
		};
		
		iRef1.show();
		iRef1.fun();

	}

}

package com.auribises.inheritance;

class CA{
	
	int a;
	static int b;
	
	CA(){
		System.out.println("CA Constructor Executed");
	}
	
	void show(){
		System.out.println("This is show");
	}
	
	static void showAgain(){
		System.out.println("This is showAgain");
	}
}

class CB extends CA{ // Inheritance
	CB(){
		System.out.println("CB Constructor Executed");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*CA ca1 = new CA();
		CA ca2 = new CA();
		
		ca1.show();
		ca2.show();
		
		CA.showAgain();*/
		
		//CA ca = new CA();
		
		CB cb = new CB();
		cb.show();
		
		CB.showAgain();
	}

}

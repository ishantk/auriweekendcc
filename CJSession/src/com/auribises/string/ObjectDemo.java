package com.auribises.string;

class CA {//extends Object{
	void show(){
		System.out.println("This is show");
	}
	
	public String toString(){
		String str = "Awesome... ---- "+super.toString();
		return str;
	}
}

class CB extends CA{
	public String toString(){
		String str = "This is a Great Day...!!"+super.toString();
		return str;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		CA caRef = new CA();
		caRef.show();
		System.out.println(caRef.hashCode());
		System.out.println(caRef.getClass());
		System.out.println(caRef.getClass().getName());
		System.out.println(caRef.getClass().getSimpleName());
		
		System.out.println(caRef);
		System.out.println(caRef.toString());
		
		
		// Run Time Polymorphism
		Object oRef;
		oRef = new CA();
		oRef = new CB();
		oRef = new Integer(10);
		oRef = new String();
		
		CB cbRef = new CB();
		System.out.println(cbRef);
		

	}

}

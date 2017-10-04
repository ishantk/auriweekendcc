package com.auribises.interfaces;

interface Library{
	void issueBooksOnThu();
}

interface Canteen{
	void lunchAt2();
}

interface Services extends Library,Canteen{
	
}

class Student implements Services{//Library, Canteen{

	public void lunchAt2() {
		System.out.println("Lets eat Rajma Rice");
	}

	public void issueBooksOnThu() {
		System.out.println("Lets issue Thinking in C++");
	}
	
}

public class InfDemo {

	public static void main(String[] args) {

		/*Library lRef = new Student();
		lRef.issueBooksOnThu();
		
		//Canteen cRef = new Student();
		//cRef.lunchAt2();
		
		Canteen cRef = (Student)lRef; // DownCast
		cRef.lunchAt2();*/
		
		Services s = new Student();
		s.lunchAt2();
		s.issueBooksOnThu();
		
		
		
		
		
	}

}

package com.auribises.threads;

class Table{
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		
	}
}

class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table s) {
		t = s;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(5);
			//t.fun();
		}
	}
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table s) {
		t = s;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(7);
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {

		Table t = new Table();
		//t.printTable(5);
		
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		mRef.start();
		yRef.start();
	}

}

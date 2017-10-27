package com.auribises.threads;

class Message{
	
	String msg;
	
	Message(){
		msg = "No Message Available!!";
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
	
	void writeMessage(){
		msg = "Be Exceptional !!";
		System.out.println("Message Written !!");
	}
}

class ReaderThread extends Thread{
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			m.writeMessage();
			//m.notify();
			m.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message();

		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		//if(rt1.getState() == Thread.State.NEW){
			
		//}
		
		rt1.setDaemon(true);
		
	}

}

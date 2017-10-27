package com.auribises.threads;

/*class Task{
	void performTask(){
		for (int i = 0; i <= 1000; i++) {
			System.out.println("**Task** "+i);
		}
	}
}*/
class Task extends Thread{
	
	Task(String name){
		super(name);
	}
	
	public void run(){
		for (int i = 0; i <= 10; i++) {
			
			try {
				Thread.sleep(1000); //1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("**Task** "+i);
		}
	}
}

/*class A{
	
}

class B extends A implements Runnable{
	
}*/

class MyTask implements Runnable{
	public void run(){
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("##MyTask## "+i);
		}
	}
}



public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		//Task tRef = new Task();
		//tRef.performTask();
		
		Task tRef = new Task("Alpha");
		
		Runnable r = new MyTask();
		Thread th = new Thread(r);
		
		//tRef.setName("Alpha");
		th.setName("Charlie");
		Thread.currentThread().setName("John");
		
		tRef.setPriority(Thread.MAX_PRIORITY); //10
		th.setPriority(Thread.MIN_PRIORITY); //10
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //10
		
		tRef.start();
		
		try {
			tRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		th.start();
		
		Thread.yield();
		
		//new Thread(new MyTask()).start();
		//new Task().start();
		
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("==Main Thread== "+i);
		}
		
		System.out.println("Task Name: "+tRef.getName());
		System.out.println("MyTask Name: "+th.getName());
		System.out.println("Main Name: "+Thread.currentThread().getName());
		
		System.out.println("Task Priority: "+tRef.getPriority());
		System.out.println("MyTask Priority: "+th.getPriority());
		System.out.println("Main Priority: "+Thread.currentThread().getPriority());
		
		System.out.println("Main Finished...");

	}

}

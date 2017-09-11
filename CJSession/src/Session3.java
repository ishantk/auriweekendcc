class Counter{
	
	// Attribute
	int count;
	static int scount;
	Counter(){
		count = 1;
		scount = 1;
	}
	
	void incrementCount(){
		count++;
		scount++;
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount);
	}
	
//	static void fun(){
//		count++;
//	}
}

class StatDemo{
	
	int i;
	static int j;
	
	void sayHello(){
		System.out.println("Hello Dear..");
	}
	
	static void sayBye(){
		System.out.println("Bye Dear...");
	}
}


public class Session3 {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount(); // 2
		c2.incrementCount(); // 2
		c3.incrementCount(); // 3
		
		c3.incrementCount(); // 4
		c1.incrementCount(); // 5
		
		c1.incrementCount(); // 6

		c2.incrementCount(); // 3
		c1.incrementCount(); // 7
		
		c1.showCount();// 10 5    ?  
		c2.showCount();// 9  3    ?
		c3.showCount();// 7  Hexa ?
		
		/*StatDemo sd = new StatDemo();
		sd.sayHello();
		StatDemo.sayBye();*/
	}

}

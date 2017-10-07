package com.auribises.exceptions;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("Main Started..");
		
		//int[] arr = {10,20,30,40,50}; //Implicit
		int[] arr = new int[]{10,20,30,40,50}; // Explicit
		
		try{
			
			System.out.println("arr[4] is: "+arr[4]);
			
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("c is: "+c);
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println("Some Error");
			System.out.println("Some Error "+aRef);
			//aRef.printStackTrace();
		}catch(ArithmeticException aRef){
			//System.out.println("Some Error");
			System.out.println("Some Error "+aRef);
			//aRef.printStackTrace();
		}*/
		catch(Exception e){
			//System.out.println("Some Error");
			System.out.println("Some Error "+e);
			//e.printStackTrace();
		}finally{
			System.out.println("Has to be Executed...");
		}

		System.out.println("Main Finished..");
	}

}

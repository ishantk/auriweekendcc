package com.auribises.exceptions;

import java.io.IOException;

// User Defined Exception or Custom Exception
class BankingException extends RuntimeException{
	
	BankingException(String message){
		super(message);
	}
}

class OnlineBanking{
	
	int balance = 10000;
	int minBal = 2000;
	int count = 0;
	
	void withdraw(int amt){
		balance = balance - amt;
		if(balance<=minBal){
			count++;
			balance = balance + amt;
			System.out.println("Withdraw Rejected! Balance is Low: \u20b9"+balance);
			if(count == 3){
				//ArithmeticException ae = new ArithmeticException("Balance is Low");
				//throw ae;
				BankingException be = new BankingException("Balance is LOW");
				throw be;
			}
		}else{
			System.out.println("Withdraw Accepted! Balance is: \u20b9"+balance);
		}
		
	}
	
	void withdrawAgain(int amt) throws IOException{
		balance = balance - amt;
		if(balance<=minBal){
			count++;
			balance = balance + amt;
			System.out.println("Withdraw Rejected! Balance is Low: \u20b9"+balance);
			if(count == 3){
				IOException io = new IOException("Balance is Low");
				throw io;
			}
		}else{
			System.out.println("Withdraw Accepted! Balance is: \u20b9"+balance);
		}
		
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Banking Started..");
		OnlineBanking banking = new OnlineBanking();
		
		for(int i=1;i<=10;i++){
			banking.withdraw(3000);
		}
		
		/*for(int i=1;i<=10;i++){
			try{
				banking.withdrawAgain(3000);
			}catch(IOException e){
				System.out.println("Some error: "+e);
			}
		}*/
		
		System.out.println("Banking Finished..");
	}

}

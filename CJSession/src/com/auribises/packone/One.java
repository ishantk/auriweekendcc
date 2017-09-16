package com.auribises.packone;

public class One {

	private void pvtShow(){
		System.out.println("This is private show");
	}
	
	void defShow(){
		System.out.println("This is default show");
	}
	
	protected void protShow(){
		System.out.println("This is protected show");
	}
	
	public void pubShow(){
		System.out.println("This is public show");
	}
	
}

class Two {
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

/* Error
private class Three{
	
}

protected class Four{
	
}*/


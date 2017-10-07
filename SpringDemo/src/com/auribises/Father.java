package com.auribises;

public class Father {
	
	// Attributes
	String fname;
	String lname;
	int money;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", money=" + money + "]";
	}
}

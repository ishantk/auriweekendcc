package com.auribises;

import org.springframework.aop.framework.ProxyFactoryBean;

public class Student {
	
	int roll;
	String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Business Method
	public void registerStudent(int roll, String name){
		
		//Some DB Code
		// Assuming registerStudent shall take 2 secs to save the data
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+" Registered Successfully with roll number "+roll);
	}
	
	
	public void fun(int i){
		System.out.println("This is fun");
	}
	
	
	
}

package com.auribises;

public class Person {

	// Attributes
	String name;
	int age;
	Address adrs; // HAS-A Relation
	
	public Person(){
		
	}
	
	public Person(String name, int age, Address adrs) {
		this.name = name;
		this.age = age;
		this.adrs = adrs;
	}
	
	public Person(Address adrs){
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adrs=" + adrs + "]";
	}

}

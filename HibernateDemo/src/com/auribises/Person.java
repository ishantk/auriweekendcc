package com.auribises;

public class Person {

	// Attributes
	Integer pid;
	String name;
	String email;
	String phone;
	Integer age;
	
	Address address; // HAS-A
	
	// Constructors
	public Person(){
		
	}
	
	public Person(Integer pid, String name, String email, String phone, Integer age, Address address) {
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.address = address;
	}
	
	
	// Getters and Setters
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
}

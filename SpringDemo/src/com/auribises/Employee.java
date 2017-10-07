package com.auribises;

// POJO or Bean or Model

// Spring FW -> Bean
public class Employee {
	
	// Attributes
	Integer eid;
	String name;
	Integer age;
	String email;
	String address;
	
	public Employee(){
		System.out.println("Employee Constructed");
	}
	
	public Employee(Integer eid, String name, Integer age, String email, String address) {
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]\n"+super.toString();
	}
	
	public void myInit(){
		System.out.println("--myInit Executed--");
	}
	
	public void myDestroy(){
		System.out.println("--myDestroy Executed--");
	}
	
}

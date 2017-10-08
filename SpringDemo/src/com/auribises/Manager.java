package com.auribises;

import java.util.List;

public class Manager {

	String name;
	int age;
	String email;
	List<String> certificates; // HAS-A | 1 - *
	//List<Certificate> certificates;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + name + ", age=" + age + ", email=" + email + ", certificates=" + certificates + "]";
	}
}

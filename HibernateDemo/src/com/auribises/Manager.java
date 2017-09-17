package com.auribises;

import java.util.List;

public class Manager {

	// Attributes
	Integer mid;
	String name;
	Integer salary;
	List<Certificate> certiList; // HAS-A
	
	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, Integer salary, List<Certificate> certiList) {
		this.mid = mid;
		this.name = name;
		this.salary = salary;
		this.certiList = certiList;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<Certificate> getCertiList() {
		return certiList;
	}

	public void setCertiList(List<Certificate> certiList) {
		this.certiList = certiList;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", salary=" + salary + ", certiList=" + certiList + "]";
	}
	
}

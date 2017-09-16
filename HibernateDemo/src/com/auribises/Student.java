package com.auribises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	// Attributes
	
	@Id @GeneratedValue
	@Column(name="ROLL")
	Integer roll;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="AGE")
	Integer age;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="STD")
	Integer std;
	
	// Constructors
	public Student(){
		
	}
	
	public Student(Integer roll, String name, Integer age, String address, Integer std) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.address = address;
		this.std = std;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStd() {
		return std;
	}

	public void setStd(Integer std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", address=" + address + ", std=" + std
				+ "]";
	}
}

package com.learning.learning.Springboot;

import java.util.Date;

public class Employee {

	int employeeId;
	int Age;
	String Name;
	private Date bdate;

	public Employee() {

	}

	public Employee(int employeeId, int age, String name, Date bdate) {
		super();
		this.employeeId = employeeId;
		Age = age;
		Name = name;
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", Age=" + Age + ", Name=" + Name + ", bdate=" + bdate + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

}

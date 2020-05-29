package com.learning.learning.Springboot;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Employee")
public class Employee {

	int employeeId;
	int Age;

	String Name;
	private Date bdate;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

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

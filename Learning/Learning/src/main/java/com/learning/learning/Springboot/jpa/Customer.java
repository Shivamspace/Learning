package com.learning.learning.Springboot.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(name = "Customer_table")
@JsonRootName("user")
public class Customer {

	@Id
	@GeneratedValue
	int customerid;
	int Age;
	String Name;
	private Date bdate;

	public Customer() {

	}

	public Customer(int age, String name, Date bdate) {
		super();

		Age = age;
		Name = name;
		this.bdate = bdate;
	}

	public Customer(int customerid, int age, String name, Date bdate) {
		super();
		this.customerid = customerid;
		Age = age;
		Name = name;
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "\nCustomer [customerid=" + customerid + ", Age=" + Age + ", Name=" + Name + ", bdate=" + bdate + "]";
	}

	public int getEmployeeId() {
		return customerid;
	}

	public void setEmployeeId(int employeeId) {
		this.customerid = employeeId;
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

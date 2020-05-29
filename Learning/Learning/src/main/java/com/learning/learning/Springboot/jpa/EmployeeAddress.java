package com.learning.learning.Springboot.jpa;

public class EmployeeAddress {
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "EmployeeAddress [id=" + id + ", name=" + name + "]";
	}
	public EmployeeAddress() {
		
	}
	public EmployeeAddress(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

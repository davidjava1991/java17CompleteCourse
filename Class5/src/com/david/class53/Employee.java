package com.david.class53;

public class Employee {
	private int id;
	private String name;
	private String department;
	public Employee() {
		System.out.println("inside default constructor");
		this.department = "CSE";
	}
	Employee(int id, String name) {
		this();// calling constructor with this
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

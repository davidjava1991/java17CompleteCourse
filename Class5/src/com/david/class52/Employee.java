package com.david.class52;

public class Employee {
	private int id;
	private String name;
	private boolean manager;
	public Employee(int id, String name, boolean manager) {
		this.id = id;
		this.name = name;
		this.manager = manager;
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
	public boolean isManager() {
		return manager;
	}
	public void setManager(boolean manager) {
		this.manager = manager;
	}
	
	
}

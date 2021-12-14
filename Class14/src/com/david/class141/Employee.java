package com.david.class141;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{id="+this.id+", name="+this.name+", salary="+this.salary+"}";
	}
}

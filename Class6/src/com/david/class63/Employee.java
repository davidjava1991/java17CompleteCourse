package com.david.class63;

public class Employee extends Person {
	int id;
	
	Employee(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	@Override
	public void sayHello() { // override with same modifier 
		System.out.println("Hi i am an Enployee'");
	}
	
	@Override
	protected void walk(int d) { // override with wider modifier
		System.out.println("Employee walked "+ d +" miles");
	}
	@Override
	 public String run(int d) { // override with wider modifier
		return "Employee run "+d+" miles";
	}

	
}

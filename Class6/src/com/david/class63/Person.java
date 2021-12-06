package com.david.class63;

public class Person {
	private String name;
	protected int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void sayHello() { // public method
		System.out.println("Hello i am a Person");
	}
	void walk(int distance) { // default method
		System.out.println("Person walked "+distance+" miles");
	}
	protected String run(int distance) { // protected method
		return"Person run "+distance+" miles";
	}
	
	
	
}

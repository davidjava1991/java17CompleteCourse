package com.david.class144;

public class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "id = "+this.id+" , name = "+name+" , age = "+this.age;
	}
	
	
}

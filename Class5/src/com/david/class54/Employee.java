package com.david.class54;

public record Employee(int id, String name) {
	public Employee() {
		this(0,null);
	}
	
	public Employee(String name) {
		this(0,name);
		
	}
	public void printName() {// non static method
		System.out.println("name : "+this.name);
	}
	static int staticVar = 100;
	static void testMethod(){ // static method
		System.out.println("Hello");
	}
}

package com.david.class54;

public class Example2 {
	public static void main(String[] args) {
		Employee e = new Employee(12,"David");
		e.printName(); // calling non static method
		Employee.testMethod();// calling static method
	}
}

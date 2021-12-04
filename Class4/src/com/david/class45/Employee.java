package com.david.class45;

public class Employee {
	static int minimumSalary;
	int id;
	int salary;
	
	static {// SIB block
		System.out.println("static initialization block called");
		minimumSalary = 1000;
	}
	Employee(int idNum) {
		id = idNum;
		salary = minimumSalary;
	}
	public static void main(String[] args) {
		Employee e = new Employee(1);
		System.out.println("salry of e is = "+e.salary);
	}
	
}

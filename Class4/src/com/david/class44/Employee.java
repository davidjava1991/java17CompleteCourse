package com.david.class44;

public class Employee {
	int id;
	String name;
	static String department;
	public Employee(int eId,String eName) {
		department = "Accounting";
		id = eId;
		name = eName;
		print();//accessing non static member
	}
	void print() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("department : "+department);
	}
}

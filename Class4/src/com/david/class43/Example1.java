package com.david.class43;

public class Example1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();// creating employee object
		e1.id =1; // setting fields of empployee 
		e1.name = "David";
		if(e1 instanceof Employee) {
			System.out.println("e1 referes to an Employee instance");
			System.out.println("name : "+e1.name);
		}
	}
}

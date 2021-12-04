package com.david.class42;

public class Student {
	static String SCHOOL = "boys local";// constant
	static int studentCount =0; // to count registered students
	int id;
	String name;
	
	public void registerStudent() {
		System.out.println(name+ " is registered");
		studentCount++; 
	}	
	
	void callStudent(){
		System.out.println("Hello");
		
	}
	static  void status() {
		System.out.println(SCHOOL + " has "+studentCount+" students");
	}
	
	
	
}

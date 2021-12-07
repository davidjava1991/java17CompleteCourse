package com.david.class73;

public final class Student { // no other class can extend 
	int id;
	String name;
	final String COLLEGE; // final variable
	 Student(int id, String name){
		 this.COLLEGE = "Oxford";// initialize the final variable
		 this.id = id;
		 this.name = name;
	 }
	 
	 public final void printStudent() { // final method cannot override
		 System.out.println("id : "+this.id);
		 System.out.println("name : "+this.name);
		 //this.COLLEGE = "IIT"; throw error
		 System.out.println("college : "+this.COLLEGE);
	 }
	
	 public static void main(String[] args) {
		Student s = new Student(22,"David");
		s.printStudent();
	}
}

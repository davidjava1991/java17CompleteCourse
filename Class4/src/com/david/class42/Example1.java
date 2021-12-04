package com.david.class42;

public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		s1.name= "david";
		s1.registerStudent();
		s1.callStudent();
		Student s2 = new Student();
		s2.id = 1;
		s2.name= "jos";
		s2.registerStudent();
		s2.callStudent();
		Student.status();// call static method
	
	}
}

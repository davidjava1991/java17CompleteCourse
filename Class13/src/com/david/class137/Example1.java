package com.david.class137;

public class Example1 {
	public static void main(String[] args) {
		Class<Student> s1 = Student.class;
		System.out.println(s1);
		try {
			Class<Student> s2 = (Class<Student>) Class.forName("com.david.class137.Student");
			System.out.println(s2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<Student> s3 = (Class<Student>) new Student().getClass();
		System.out.println(s3);
		
	}
	
}

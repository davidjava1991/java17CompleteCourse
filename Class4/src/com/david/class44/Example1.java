package com.david.class44;

public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student();// calling no arg constructor
		Student s2 = new Student(1);// calling single arg constructor
		System.out.println("s2 id = "+s2.id);
		Student s3 = new Student(2,"David","CSE");// multiple arg
		System.out.println("s3 id = "+s3.id);
		System.out.println("s3 name = "+s3.name);
		System.out.println("s3 branch = "+s3.branch);
	}
}

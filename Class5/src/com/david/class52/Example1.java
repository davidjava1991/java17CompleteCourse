package com.david.class52;

public class Example1 {
	public static void main(String[] args) {
		Student s1 =  new Student(1,"David","CSE");
		Student s2 =  new Student(3,"Paul","EEE");
		Student s3 =  new Student(4,"Jos","CSE");
		System.out.println("name of s1 "+s1.getName());
		System.out.println("name of s2 "+s2.getName());
		System.out.println("name of s3 "+s3.getName());
		s1.setName("steve");
		System.out.println("name of s1 after setter "+s1.getName());
		
	}
}

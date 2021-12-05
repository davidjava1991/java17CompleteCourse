package com.david.class54;

public class Example1 {
	public static void main(String[] args) {
		Student s = new Student(12, "David", "CSE");
		System.out.println("--- getters ---");
		System.out.println(" id : "+s.id());
		System.out.println(" name : "+s.name());
		System.out.println(" branch : "+s.branch());
		System.out.println("------toString-----");
		System.out.println(s.toString());
	}
}

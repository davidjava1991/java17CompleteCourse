package com.david.class24;

public class Example2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "David";
		Student s2 = new Student();
		s2 = s1;//s1 is ready for gc
	}
}

package com.david.class102;

public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "David");
		System.out.println("toString method : "+s1.toString());
		System.out.println("hashcode method : "+s1.hashCode());
		Student s2 =new Student(1, "Paul");
		System.out.println("equals method : "+s1.equals(s2));
		s1 = null;
		System.gc();
	}
}

package com.david.class103;

public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student(2,"David");
		try {
			Student s2 =(Student) s1.clone();
			System.out.println("s1 : "+s1);
			System.out.println("s2 : "+s2);
			System.out.println("equals :"+s1.equals(s2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

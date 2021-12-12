package com.david.class129;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student(21,"David");
		Student s2 = new Student(23,"David");
		Student s3 = new Student(13,"Adam");
		Student s4 = new Student(2,"Sam");
		Student s5 = new Student(5,"Kane");
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		Collections.sort(students);
		System.out.println("sorted list"+students);
		
		
	}
}

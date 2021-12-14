package com.david.class144;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
		list.add(new Student(32, "Paul", 42));
		list.add(new Student(3, "David", 22));
		list.add(new Student(42, "Phil", 32));
		list.add(new Student(12, "jose", 23));
		list.add(new Student(7, "sam", 26));
		list.add(new Student(67, "Adam", 41));
		list.stream() 
				.filter(p-> p.age >25)
				.map(p-> "age = "+p.age)
				.forEach(System.out::println);
		System.out.println("All match : "+list.stream()
			.allMatch(s -> s.id>2));
		System.out.println("Any match : "+list.stream()
			.anyMatch(s -> s.id>20));
	}
}

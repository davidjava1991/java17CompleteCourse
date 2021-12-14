package com.david.class143;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example2 {
	public static void main(String[] args) {
		Student s1 = new Student(27,"David",43);
		Student s2 = new Student(21,"Tom",33);
		Student s3 = new Student(43,"Paul",31);
		Student s4 = new Student(64,"Sam",21);
		Student s5 = new Student(23,"Henry",17);
		List<Student> stList = Arrays.asList(s1,s2,s3,s4,s5);
		Predicate<Student> p1 =  s -> s.age > 25;
		stList.stream().filter(p1).forEach(System.out::println);
	}

}

package com.david.class129;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(13, "David", 43);
		Employee e2 = new Employee(11, "Paul", 45);
		Employee e3 = new Employee(17, "Smith", 33);
		Employee e4 = new Employee(10, "Sean", 23);
		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		Collections.sort(eList,new AgeComparator());
		System.out.println("sorted based on age : "+eList);
		
		
	}
}

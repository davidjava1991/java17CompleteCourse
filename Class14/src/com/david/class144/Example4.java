package com.david.class144;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
	public static void main(String[] args) {
		Employee e1 = new Employee(22, "David", 3000);
		Employee e2 = new Employee(42, "Paul", 2000);
		Employee e3 = new Employee(4, "Jose", 4000);
		Employee e4 = new Employee(34, "Adam", 5000);
		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		Map<Integer,String> eMap = eList.stream()
									.collect(Collectors.toMap(e->e.id, e->e.name));
		System.out.println("list to map"+eMap);
	}
}

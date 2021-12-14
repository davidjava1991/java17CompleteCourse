package com.david.class141;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(new Employee(22, "David", 3000));
		eList.add(new Employee(27, "Paul", 2000));
		eList.add(new Employee(2, "Adam", 1000));
		eList.add(new Employee(42, "Jose", 4000));
		eList.add(new Employee(22, "Ben", 5000));
		Comparator<Employee> eNameComp = Comparator.comparing(e-> e.name);
		Collections.sort(eList,eNameComp);
		eList.forEach(e -> System.out.println(e));
		
	}
}

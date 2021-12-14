package com.david.class144;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example3 {
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
		Optional<Integer> totalSalary = eList.stream()
							.map(e -> e.salary)
							.reduce((sum, salary)->sum+salary);
		System.out.println("Total salary using reduce : "+totalSalary.get());
		int totalS = eList.stream()
				.collect(Collectors.summingInt(e -> e.salary));
		System.out.println("Total salary by collectors : "+totalS);
							
	}	
}

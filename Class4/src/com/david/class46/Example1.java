package com.david.class46;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell");
		Laptop l2 = new Laptop("lenovo");
		Laptop l3 = new Laptop("hp");
		ArrayList<Laptop> laps = new ArrayList<>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		Person p1 = new Person("David", laps);
		System.out.println("laptops of "+p1.name);
		for( Laptop l : p1.laptops) {
			System.out.println(l.name); 
		}
		
		
	}
}

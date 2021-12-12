package com.david.class125;

import java.util.HashSet;

public class Example1 {
	public static void main(String[] args) {
		HashSet<Integer> odd = new HashSet<>();
		odd.add(1);
		odd.add(3);
		odd.add(5);
		odd.add(7);
		HashSet<Integer> even = new HashSet<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		System.out.println(odd.retainAll(even));
		System.out.println("retain all "+odd);
		System.out.println("To array");
		for(Object a : even.toArray() ) {
			System.out.println(a);
		}
		
		
		
		
	}
}

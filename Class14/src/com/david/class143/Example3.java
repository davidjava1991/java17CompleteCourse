package com.david.class143;

import java.util.HashSet;

public class Example3 {
	public static void main(String[] args) {
	HashSet<Integer> numSet = new HashSet<>();
	numSet.add(10);
	numSet.add(10);
	numSet.add(22);
	numSet.add(34);
	numSet.add(46);
	numSet.add(12);
	numSet.add(53);
	numSet.removeIf(n -> n>25);
	System.out.println("After removal "+numSet);
	
	}	
}

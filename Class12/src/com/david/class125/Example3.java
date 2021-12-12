package com.david.class125;

import java.util.Set;
import java.util.TreeSet;

public class Example3 {
	public static void main(String[] args) {
		Set<Integer> intSet = Set.of(33,21,3,22,75,31,48,93);
		TreeSet<Integer> sortedSet = new TreeSet<>(intSet);
		System.out.println(sortedSet);
	}
}

package com.david.class128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("David");
		s.add("Sam");
		s.add("Paul");
		s.add("Adam");	
		Collections.sort(s);// sort method
		System.out.println("Sorted list : "+s);
		Collections.shuffle(s);// shuffle
		System.out.println("Shuffled list : "+s);
		Collections.sort(s);
		System.out.println("binary search : "+Collections.binarySearch(s, "David"));
	}
}

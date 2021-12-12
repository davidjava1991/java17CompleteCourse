package com.david.class128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Tiger");
		animals.add("Dog");
		animals.add("Cat");
		ArrayList<String> mammals = new ArrayList<>();
		mammals.add("Dog");
		mammals.add("Zebra");
		mammals.add("Cat");
		System.out.println("disjoint : "+Collections.disjoint(animals, mammals));
		System.out.println("frequency : "+Collections.frequency(animals, "Dog"));
		Collections.copy(mammals, animals);
		System.out.println("mammals :  "+mammals);
	}
}

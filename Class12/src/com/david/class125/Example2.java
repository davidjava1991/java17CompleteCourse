package com.david.class125;

import java.util.LinkedHashSet;

public class Example2 {
	public static void main(String[] args) {
		LinkedHashSet<String> instruments = new LinkedHashSet<>();
		instruments.add("Guitar");
		instruments.add("Violin");
		instruments.add("Piano");
		instruments.add("Flute");
		instruments.add("Drum");
		System.out.println(instruments);
		instruments.clear();
		System.out.println(instruments);
		
	}
	
}

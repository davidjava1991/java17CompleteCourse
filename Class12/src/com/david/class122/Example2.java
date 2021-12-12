package com.david.class122;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		Continent con[] = { new Continent("Asia",
				80), new Continent("Europe", 40),
				new Continent("Africa", 50),
				new Continent("Antartica", 20),
				new Continent("North America", 40),
				new Continent("South America", 40),
				new Continent("Australia", 20)};
		Arrays.sort(con);
		for( Continent c : con) {
			System.out.println(c);
		}
		Continent[] cpy = Arrays.copyOfRange(con, 0, 3);
		System.out.println("copied array: "+Arrays.toString(cpy));
	}
	
}

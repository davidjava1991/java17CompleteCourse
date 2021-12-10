package com.david.class101;

public class Example1 {
	public static void main(String[] args) {
		Week w = Week.FRI; 
		System.out.println(w);// printing string representation
		System.out.println("ordinal of friday = "+w.ordinal());
		System.out.println("value of friday = "+Week.valueOf("FRI"));
		System.out.println("printing all values");
		for(Week week: Week.values()) {
			System.out.println(week);
		}
	}
}

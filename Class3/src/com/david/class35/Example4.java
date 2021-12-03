package com.david.class35;

public class Example4 {
	static double getDouble(Object o) {
	    return switch (o) {
	        case Integer i -> i.doubleValue();
	        case Float f -> f.doubleValue();
	        case String s -> Double.parseDouble(s);
	        default -> 0d;
	    };
	}
	public static void main(String[] args) {
		System.out.println("Pattern matching for switch");
		System.out.println("Integer : "+getDouble(new Integer(14)));
		System.out.println("Float : "+getDouble(new Float(17.34)));
		System.out.println("String "+getDouble("4.32"));
	}
}

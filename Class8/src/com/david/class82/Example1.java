package com.david.class82;

public class Example1 {
	
	public static Integer sum(Integer a, Integer b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int a = 23;
		Integer b = a; // auto boxing
		System.out.println(" Value of b = "+b);
		Double d = Double.valueOf(53.23);
		double d1 = d;// auto un-boxing
		System.out.println("value of d1 = "+d1);
		System.out.println("sum = "+sum(23,43));// auto boxing
		
	}
}	

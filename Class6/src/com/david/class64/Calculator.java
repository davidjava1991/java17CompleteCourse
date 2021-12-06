package com.david.class64;

public class Calculator {
	public int multiply(int a, int b){
		System.out.println("inside int multiply(int a, int b)");
		return a*b;
	}
	
	public int multiply(int a, int b, int c){
		System.out.println("inside int multiply(int a, int b, int c)");
		return (a*b*c);
	}
	public int multiply(float a, float b) {
		System.out.println("inside int multiply(float a, float b)");
		return (int)(a*b);
	}
	public double multiply(double a, double b) {
		System.out.println("inside double multiply(double a, double b)");
		return (a*b);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.multiply(2, 3));
		System.out.println(c.multiply(2, 3, 2));
		System.out.println(c.multiply(2.0, 3));
		System.out.println(c.multiply(3.0f, 3));
		
		
	}
}

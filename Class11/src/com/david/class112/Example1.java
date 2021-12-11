package com.david.class112;

public class Example1 {
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
		try { // try block
			System.out.println(a/b);
		} catch(ArithmeticException e) {// catch block
			System.err.println("error  printed");
			e.printStackTrace();
		}
		
	}
}

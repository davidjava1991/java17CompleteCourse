package com.david.class72;

public class MyCalculator implements Calculator{

	@Override
	public int add(int x, int y) {// implementing the method
		return x+y;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public void testMethod() {
		System.out.println("inside testMethod");
	}
	
	public static void main(String[] args) {
		Calculator c1 = new MyCalculator();// creating reference type of interface
		Calculator.testStaticMethod();
		c1.testDefaultMethod();
		c1.add(23, 12);// calling implementation
		c1.multiply(3, 3);
		MyCalculator m = new MyCalculator();
		m.testMethod();// this method is not accessible for c1
	}

}

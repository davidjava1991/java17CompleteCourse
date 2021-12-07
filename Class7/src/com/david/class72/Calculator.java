package com.david.class72;

public interface Calculator {
	public static int var1 = 12;
	private void start() { // private method
		System.out.println("Calculator started");
	}
	default void testDefaultMethod() { // default method
		this.start();
		System.out.println(" inside default method");
	}
	
	 static void testStaticMethod() {// static method
		 System.out.println("inside static method");
		 System.out.println("static var1 = "+var1);
	 }
	 public abstract int add(int x, int y);// abstract method
	 public abstract int multiply(int x, int y); // abstract method

}

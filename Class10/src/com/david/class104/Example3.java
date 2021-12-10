package com.david.class104;

public class Example3 {
	void printMessage() {
		class Inner{
			static int i = 10;
			int j = 5;
		}
		Inner obj = new Inner();
		System.out.println("i ="+Inner.i);
		System.out.println("j ="+obj.j);
	}
	public static void main(String[] args) {
		new Example3().printMessage();
	}
}

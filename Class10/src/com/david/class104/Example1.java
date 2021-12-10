package com.david.class104;

public class Example1 {
	class Inner {
		static int i = 5;
		int j =10;
	}
	public static void main(String[] args) {
		Inner obj = new Example1().new Inner();
		System.out.println("i = "+Inner.i);
		System.out.println("j = "+obj.j);
	}
}

package com.david.class104;

public class Example2 {
	static class Inner{
		static int i = 5;
		int j = 10;
		public static void main(String[] args) {
			Inner obj = new Inner();
			System.out.println("i = "+Inner.i);
			System.out.println("j = "+obj.j);
		}
	}
}

package com.david.class51;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Hi");
		//new Example3().i; not visible
		new Example3().j =10; // default member
	}
}
class Example3 {
	private int i;
	int j;
}

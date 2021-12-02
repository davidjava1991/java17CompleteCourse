package com.david.class23;

public class Example1 {
	public static void main(String[] args) {
		int i =1;
		System.out.println("post "+i++);
		System.out.println("post after "+i);
		int j =1;
		System.out.println("pre "+(++j));
		System.out.println("post after "+j);
	}
}

package com.david.class48;

public class Example2 {
	static public void print(String param1,String... param2) {
		System.out.println(param1);
		for( String a : param2) {
			System.out.print(a+" ");
		}
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		print("Hi");
		print("Hi","David");
		print("Hi", "David","How","are","you?");
	}
}

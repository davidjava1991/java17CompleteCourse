package com.david.class101;

public class Example3 {
	enum Colour{ RED,BLUE,GREEN;// declaring enum inside a class
	};
	public static void main(String[] args) {
		Colour c1 = Colour.BLUE;
		System.out.println(c1);
	}
}

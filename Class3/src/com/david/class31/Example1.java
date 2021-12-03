package com.david.class31;

public class Example1 {
	public static void main(String[] args) {
		int a =120;
		if(a>5) { // if 
			System.out.println("a is grater than 5");
		}
		int b =20;
		if(a == 15) { // if else
			System.out.println("b is 15");
		} else {
			System.out.println("b is not 15");
		}
		
		if(a>b) { // if else if else
			System.out.println("a is greater");
		} else if(b>a){
			System.out.println("b is greater");
		} else {
			System.out.println("both are equal");
		}
		
	}
}

package com.david.class132;

public class Example1 {
	public static void main(String[] args) {
		Generic<Integer> integer = new Generic<>();
		integer.addItem(1);
		System.out.println("Generic integer : "+integer.getItem());
		Generic<String> string = new Generic<>();
		string.addItem("Apple");
		System.out.println("Generic String : "+string.getItem());
	}
}

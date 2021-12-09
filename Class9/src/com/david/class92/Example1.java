package com.david.class92;

public class Example1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("i like apple");
		sb.append(", orange").append(" and banana");
		System.out.println(" value of sb "+sb);
		System.out.println("capacity of sb "+sb.capacity());
		System.out.println("index of apple is "+sb.indexOf("apple"));
		System.out.println("delete method "+sb.delete(0, 1));
		System.out.println("insert method "+sb.insert(0, "hello, i"));
	}
}

package com.david.class142;

import java.util.function.BiFunction;

public class Addable {
	static int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> b = Addable::add;
		System.out.println("bi function add : "+b.apply(23, 45));
	}
}

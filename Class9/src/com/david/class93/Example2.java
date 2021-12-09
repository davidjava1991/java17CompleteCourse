package com.david.class93;

import java.util.StringJoiner;

public class Example2 {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(", ","mames: ",".");
		sj1.add("David");
		sj1.add("Paul");
		sj1.add("Jose");
		System.out.println(sj1);
	}
}

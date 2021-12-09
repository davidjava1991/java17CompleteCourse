package com.david.class93;

import java.util.StringJoiner;

public class Example1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(":");
		sj.add("apple");
		System.out.println("after first add "+sj);
		sj.add("orange");
		sj.add("grapes");
		System.out.println("value of sj after multiple add "+sj);
		StringJoiner sj2 = new StringJoiner("||");
		sj2.add("David");
		sj2.add("Paul");
		System.out.println("merge sj with sj2 "+sj.merge(sj2));
	}
}

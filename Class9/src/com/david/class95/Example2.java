package com.david.class95;

import java.util.regex.Pattern;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("pattermn1 [abc]: "+Pattern.matches("[abc]", "a"));
		System.out.println("pattermn2 [^abc]: "+Pattern.matches("[^abc]", "d"));
		System.out.println("pattermn3 [a-zA-Z]: "+Pattern.matches("[a-zA-Z]", "a"));
		System.out.println("pattermn4 [a-z&&[def]]: "+Pattern.matches("[a-z&&[def]]", "d"));
		System.out.println("pattermn5 [a-z&&[^bc]]: "+Pattern.matches("[a-z&&[^bc]]", "a"));
	}
}

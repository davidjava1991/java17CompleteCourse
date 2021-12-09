package com.david.class95;

import java.util.regex.Pattern;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("pattern 1 [amn]? : "+Pattern.matches("[amn]?", "a"));
		System.out.println("pattern 2 [amn]+ : "+Pattern.matches("[amn]+", "a"));
		System.out.println("pattern 3 [amn]* : "+Pattern.matches("[amn]*", "aammn"));
		System.out.println("pattern 4 [amn]{1} : "+Pattern.matches("[amn]{1}", "a"));
		System.out.println("pattern 5 [amn]{1,3} : "+Pattern.matches("[amn]{1,3}", "aaa"));
	}
}

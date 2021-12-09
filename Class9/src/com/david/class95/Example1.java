package com.david.class95;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {
		Pattern p1 = Pattern.compile(".avid"); // one way
		Matcher m1 = p1.matcher("David");
		System.out.println("pattern Matcher 1  "+m1.matches());

		boolean b1 = Pattern.compile(".avid").matcher("David").matches(); // second way
		System.out.println("pattern Matcher 2 "+b1);
		
		boolean b2 = Pattern.matches(".avid", "David");// third way
		System.out.println("pattern Matcher 3 "+b2);
		
	}
}

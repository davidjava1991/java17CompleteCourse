package com.david.class94;

import java.util.StringTokenizer;

public class Example1 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is David");
		System.out.println("token count =  "+st.countTokens());
		System.out.println(" printing each token");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}
}

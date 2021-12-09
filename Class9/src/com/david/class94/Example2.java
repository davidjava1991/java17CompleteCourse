package com.david.class94;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Example2 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("apples;oranges;grapes", ";");
		System.out.println("printing tokenns");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("apples;oranges;grapes", ";");
		Iterator<Object> it = st2.asIterator();
		System.out.println("printing using iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

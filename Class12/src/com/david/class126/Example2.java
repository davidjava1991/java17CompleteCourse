package com.david.class126;

import java.util.ArrayDeque;

public class Example2 {
	public static void main(String[] args) {
		ArrayDeque<String> q = new ArrayDeque<String>();
		q.add("David");
		q.offerLast("Tom");
		q.offer("Mark");
		q.offerFirst("Adam");
		System.out.println(q);
		System.out.println("peek first : "+q.peekFirst());
		System.out.println("peek last : "+q.peekLast());
		System.out.println("poll first : "+q.pollFirst());
		System.out.println("poll last : "+q.pollLast());
		System.out.println("q: "+q);
	}
}

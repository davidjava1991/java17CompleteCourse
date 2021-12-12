package com.david.class126;

import java.util.PriorityQueue;

public class Example1 {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.offer("David");
		q.offer("Paul");
		q.add("Adam");
		q.add("sam");
		System.out.println("queue : "+q);
		System.out.println(" peek : "+q.peek());
		System.out.println(" element : "+q.element());
		System.out.println("poll : "+q.poll());
		System.out.println("Remove : "+q.remove("David"));
		System.out.println("q : "+q);
	}
}

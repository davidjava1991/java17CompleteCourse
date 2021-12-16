package com.david.class165;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Example3 {
	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger();

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    counter.set(1);
		    System.out.println("counter 1 :"+counter.get());
		});
		executor.submit(() -> {
		    counter.compareAndSet(1, 2);
		    System.out.println("counter 2 : "+counter.get());
		});
		
	}
}

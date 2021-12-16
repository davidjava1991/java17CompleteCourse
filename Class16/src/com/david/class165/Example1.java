package com.david.class165;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Example1 {
	public static void main(String[] args) {
		ThreadPoolExecutor executor =  (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		Future<String> s1 = executor.submit(() -> {
			System.out.println("Thread1 started");
		    Thread.sleep(500);
		    return "task1 done";
		});
		Future<String> s2 = executor.submit(() -> {
			System.out.println("Thread2 started");
		    Thread.sleep(500);
		    return "task2 done";
		});
		System.out.println("Pool size : "+executor.getPoolSize());
		System.out.println("Queue size : "+executor.getQueue().size());
		try {
			System.out.println(s1.get());
			System.out.println(s2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}

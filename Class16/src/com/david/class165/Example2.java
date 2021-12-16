package com.david.class165;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Example2 {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		Future<String> op1 = executor.submit(() -> {
		    Thread.sleep(500);
		    return "thread 1 done";
		});
		Future<String> op2 = executor.submit(() -> {
		    Thread.sleep(500);
		    return "thread 2 done";
		});
		try {
			System.out.println(op1.get());
			System.out.println(op2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}

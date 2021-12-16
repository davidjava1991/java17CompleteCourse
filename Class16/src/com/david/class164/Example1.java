package com.david.class164;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
	public static void main(String[] args) {
		 ExecutorService executor = Executors.newFixedThreadPool(3);
		 String[] names = {"David","Paul","Sam","Adam", "Ben"};
		 for(String name : names) {
			 Runnable eThread = new EmployeeThread(name);
			 executor.execute(eThread);
		 }
		 executor.shutdown();
	}
}

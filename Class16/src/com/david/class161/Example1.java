package com.david.class161;

public class Example1 {
	public static void main(String[] args) {
		Runnable r = ()-> System.out.println("Thread started");
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
	}
}

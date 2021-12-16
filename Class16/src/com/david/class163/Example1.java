package com.david.class163;

public class Example1 {
	public static void main(String[] args) {
		Counter c= new Counter();
		new MyThread1(c).start();
		new MyThread2(c).start();
	}
}

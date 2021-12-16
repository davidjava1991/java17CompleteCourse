package com.david.class163;

public class MyThread1 extends Thread{
	Counter counter;
	public MyThread1(Counter c) {
		this.counter = c;
	}
	@Override
	public void run() {
		counter.count(10);
	}
		
	
	
}

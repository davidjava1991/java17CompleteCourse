package com.david.class163;

public class MyThread2 extends Thread{
	Counter counter;
	public MyThread2(Counter c) {
		this.counter = c;
	}
	@Override
	public void run() {
		counter.count(20);
	}

}

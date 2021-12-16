package com.david.class162;

public class JoinThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread started");
		for(int i =1; i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			System.out.println(i);
		}
		System.out.println("Thread ended");
	}
	
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	}
}

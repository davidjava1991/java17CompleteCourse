package com.david.class162;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread Started");
	}
	
	public static void main(String[] args) {
		MyThread m = new MyThread();
		 System.out.println("id : "+m.getId());
		 System.out.println("name : "+m.getName());
		 System.out.println("priority : "+m.getPriority());
		 System.out.println("Current thread name : "+currentThread().getName());
		 System.out.println("is Daemon : "+m.isDaemon());
	}
}

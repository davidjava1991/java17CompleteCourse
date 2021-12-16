package com.david.class164;

public class EmployeeThread implements Runnable{
	private String  name;
	public EmployeeThread(String name) {
		this.name =name;
	}
	@Override
	public void run() {
		System.out.println(" Thread "+Thread.currentThread().getId()+" started");
		System.out.println("name = "+ this.name);;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

}

package com.david.class112;

public class Example3 {
	public static void main(String[] args) {
		String test = null;
		try {
			System.out.println(test.contains("david"));
			Thread.sleep(1000);// throws checked exception
		} catch(NullPointerException|InterruptedException ex) {
			System.err.println("Error"+ex.getMessage());
		} finally {
			System.out.println("finally block ");
		}
	}
}	

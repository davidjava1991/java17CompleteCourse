package com.david.class113;

public class MyUnCheckedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyUnCheckedException(String message) {
		super(message);//passing the message to super class
	}
}

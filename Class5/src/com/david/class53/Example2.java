package com.david.class53;

public class Example2 {
	String val = "";
	public Example2 append(String val) {
		this.val += val;
		return this;
	}
	public static void main(String[] args) {
		Example2 e1 = new Example2();
		e1.append("Hi").append(" David ").append(" Paul");
		System.out.println("e1 value : "+e1.val);
	}
}

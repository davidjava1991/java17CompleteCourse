package com.david.class112;

public class Example2 {
	public static void main(String[] args) {
		int[] a = {1,2,3};;
		try {
			System.out.println(a[4]);
		} finally{
			System.out.println("finally called");
		}
	}
}

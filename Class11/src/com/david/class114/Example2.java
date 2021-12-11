package com.david.class114;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("enter some number ");
		try (Scanner sc = new Scanner(System.in)) {
			int val =sc.nextInt();
			System.out.println("you entered "+val);
		}
	}
}

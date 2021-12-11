package com.david.class115;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of goals scored ");
		int goals = sc.nextInt();
		sc.close();
		assert goals < 10; // throw assert 
		
	}
}

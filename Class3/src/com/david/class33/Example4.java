package com.david.class33;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		int n, c=0,v=0, p=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		n = sc.nextInt();
		sc.close();
		System.out.println("fibonacci series ");
		while(n>0) {
			System.out.print(" "+v);
			v = p+c;
			p = c;
			c = v;
			n--;
		}
	}
}

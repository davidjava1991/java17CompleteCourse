package com.david.class151;

import java.io.File;

public class Example3 {
	public static void main(String[] args) {
		File f = new File("./out/Sample.txt");
		System.out.println("name : "+f.getName());
		System.out.println("path : "+f.getAbsolutePath());
		System.out.println("Exists : "+f.exists());
		System.out.println("can read : "+f.canRead());
		System.out.println("can write : "+f.canWrite());
	}
}
